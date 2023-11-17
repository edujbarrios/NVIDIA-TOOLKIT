package Management;

public class FermiProfilerStrategy implements ProfilerStrategy {
    @Override
    public void profile() {
        System.out.println("Fermi Profiler: Profiling with nvprof for Fermi architecture...");
    }
}
