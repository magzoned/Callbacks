/**
 * Класс для управления событиями.
 * Поддерживает подписку на события и их рассылку.
 */

public class EventDispatcher {
    private EventListener[] clickListeners = new EventListener[10];
    private EventListener[] downloadListeners = new EventListener[10];
    private EventListener[] keyPressedListeners = new EventListener[10];

    int clickCount = 0;
    int downloadCount = 0;
    int keyPressedCount = 0;

    public void subscribeClick(EventListener listener){
        if (clickCount < 10){
            clickListeners[clickCount] = listener;
            clickCount++;
        }
        else{
            System.out.println("You have reached the maximum number of clicks");
        }
    }

    public void subscribeDownload(EventListener listener){
        if (downloadCount < 10){
            downloadListeners[downloadCount] = listener;
            downloadCount++;
        }
        else{
            System.out.println("You have reached the maximum number of Download");
        }
    }
    public void subscribeKeyPressed(EventListener listener){
        if (keyPressedCount < 10){
            keyPressedListeners[keyPressedCount] = listener;
            keyPressedCount++;
        }
        else{
            System.out.println("You have reached the maximum number of key press");
        }

    }


    public void dispatch(Event event) {
        String eventType = event.getType();

        if (eventType.equals("click")) {
            for (int i = 0; i < clickCount; i++) {
                clickListeners[i].handle(event);
            }
        } else if (eventType.equals("keyPress")) {
            for (int i = 0; i < keyPressedCount; i++) {
                keyPressedListeners[i].handle(event);
            }
        } else if (eventType.equals("Download")) {
            for (int i = 0; i < downloadCount; i++) {
                downloadListeners[i].handle(event);
            }
        }
    }


}
