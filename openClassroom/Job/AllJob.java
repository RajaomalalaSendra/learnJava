package openClassroom.Job;

public class AllJob{
    public static void main(String[] args) {
       GetJob job = new GetJob();
       System.out.println("===================================");
       System.out.println(job.getDescription());
       System.out.println("\tWorker Numbers: " + GetJob.getCount());
       System.out.println("===================================");	
    }
}