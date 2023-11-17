package Management;

public class PascalCompilerStrategy implements CompilerStrategy {
    @Override
    public void compile() {
        System.out.println("Pascal Compiler: Compiling with nvcc for Pascal architecture...");
    }
}
