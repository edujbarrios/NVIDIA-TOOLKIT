package CardFamily;

import Management.FermiCompilerStrategy;
import Management.FermiMonitoringStrategy;
import Management.FermiProfilerStrategy;
import Management.NvidiaToolkit;

public class FermiFamily extends GraphicsCardFamily {
    @Override
    public NvidiaToolkit createToolkit() {
        return new NvidiaToolkit(new FermiCompilerStrategy(), new FermiProfilerStrategy(), new FermiMonitoringStrategy());
    }
}
