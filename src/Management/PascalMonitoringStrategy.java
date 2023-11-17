package Management;

public class PascalMonitoringStrategy implements MonitoringStrategy {
    @Override
    public void monitor() {
        System.out.println("Pascal Monitoring: Monitoring with nvvm for Pascal architecture...");
    }
}
