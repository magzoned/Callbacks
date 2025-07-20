/**
 * Основной класс показывающий как работает консольное приложение(callback)
 */

public class MainManagment {
    public static void main(String[] args) {
        EventDispatcher dispatcher = new EventDispatcher();

        EventListener clickHandler = new EventListener() {
            @Override
            public void handle(Event event) {
                System.out.println("The click was processed");
                ((ClickEvent)event).click();
            }
        };


        EventListener keyHandler = new EventListener() {
            @Override
            public void handle(Event event) {
                System.out.println("The PressButton was processed");
                ((KeyPressEvent)event).pressButton();
            }
        };

        EventListener DownloadHandler  = new EventListener() {
            @Override
            public void handle(Event event) {
                System.out.println("The Download was processed");
                ((FileDownloadEvent)event).startDownload();
            }
        };


        dispatcher.subscribeClick(clickHandler);
        dispatcher.subscribeKeyPressed(keyHandler);
        dispatcher.subscribeDownload(DownloadHandler);

        dispatcher.dispatch(new ClickEvent());
        dispatcher.dispatch(new KeyPressEvent());
        dispatcher.dispatch(new FileDownloadEvent());
    }
}
