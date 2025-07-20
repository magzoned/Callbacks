public class FileDownloadEvent extends Event{
    public FileDownloadEvent(){
        super("Download");
    }
    public void startDownload(){
        System.out.println("Download is starting");
        for (int i = 0;i <= 100; i +=5){
            System.out.printf("Download - [%d] %% \n",i);

            if (i == 100){
                downloadEnd();
            }
        }
    }
    public void downloadEnd(){
        System.out.println("Download is ending");
    }
}
