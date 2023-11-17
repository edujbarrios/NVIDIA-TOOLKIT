package Management;

public class NvidiaToolkit {
    private CompilerStrategy compiler;
    private ProfilerStrategy profiler;
    private MonitoringStrategy monitoringTool;

    public NvidiaToolkit(CompilerStrategy compiler, ProfilerStrategy profiler, MonitoringStrategy monitoringTool) {
        this.compiler = compiler;
        this.profiler = profiler;
        this.monitoringTool = monitoringTool;
    }

    public void compile() {
        compiler.compile();
    }

    public void profile() {
        profiler.profile();
    }

    public void monitor() {
        monitoringTool.monitor();
    }
}
