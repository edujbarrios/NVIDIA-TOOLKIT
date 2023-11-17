package Management;

public class PascalProfilerStrategy implements ProfilerStrategy {
    @Override
    public void profile() {
        System.out.println("Pascal Profiler: Profiling with nvprof for Pascal architecture...");
    }
}
