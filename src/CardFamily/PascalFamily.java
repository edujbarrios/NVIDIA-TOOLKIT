package CardFamily;

import Management.NvidiaToolkit;
import Management.PascalCompilerStrategy;
import Management.PascalMonitoringStrategy;
import Management.PascalProfilerStrategy;

public class PascalFamily extends GraphicsCardFamily {
    @Override
    public NvidiaToolkit createToolkit() {
        return new NvidiaToolkit(new PascalCompilerStrategy(), new PascalProfilerStrategy(), new PascalMonitoringStrategy());
    }
}
