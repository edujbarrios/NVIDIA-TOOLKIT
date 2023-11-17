package CardFamily;

import Management.NvidiaToolkit;
import Management.TeslaCompilerStrategy;
import Management.TeslaMonitoringStrategy;
import Management.TeslaProfilerStrategy;

public class TeslaFamily extends GraphicsCardFamily {
    @Override
    public NvidiaToolkit createToolkit() {
        return new NvidiaToolkit(new TeslaCompilerStrategy(), new TeslaProfilerStrategy(), new TeslaMonitoringStrategy());
    }
}
