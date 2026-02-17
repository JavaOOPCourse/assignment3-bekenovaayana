public class CloudStorageService extends Service
        implements PremiumFeature, Billable {

        private boolean premium;

        public CloudStorageService(String name, int id){
            super(name, id);
            this.premium = false;
        }

    @Override
    public void performService() {

        if(!isActive()){
            System.out.println("Cloud storage is not active.");
            return;
        }
        if(premium){
            System.out.println("Accessing unlimited cloud storage.");
        }else{
            System.out.println("Accessing basic cloud storage (10GB).");
        }
    }

    @Override
    public void upgradeToPremium() {

        premium = true;
        System.out.println("Cloud storage upgraded to premium.");
    }

    @Override
    public void generateBill() {
        System.out.println("Generating bill for cloud storage usage.");
    }
}