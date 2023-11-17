package Management;

public class FermiMonitoringStrategy implements MonitoringStrategy {
    @Override
    public void monitor() {
        System.out.println("Fermi Monitoring: Monitoring with nvvm for Fermi architecture...");
    }
}
