public class StreamingService extends Service
        implements PremiumFeature {

    private boolean premium;

    public StreamingService(String name, int id){
        super(name, id);
        this.premium = false;
    }


    @Override
    public void performService() {

        if(!isActive()){
            System.out.println("Streaming service is not active.");
            return;
        }

        if(premium){
            System.out.println("Streaming in 4K Ultra HD with premium features.");
        }else{
           System.out.println("Streaming in standard quality.");
        }
    }

    @Override
    public void upgradeToPremium() {

        premium = true;
        System.out.println("Streaming service upgraded to premium.");
    }
}