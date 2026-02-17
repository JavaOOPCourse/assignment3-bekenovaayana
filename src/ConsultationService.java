public class ConsultationService extends Service
        implements Billable {

    public ConsultationService(String name, int id){
        super(name, id);
    }


    @Override
    public void performService() {
        if (!isActive()) {
            System.out.println("Consultation service is not active.");
            return;
        }

        System.out.println("Providing online consultation session.");
    }

    @Override
    public void generateBill() {
        System.out.println("Generating bill for consultation session.");
    }
}