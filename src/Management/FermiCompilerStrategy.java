package Management;

public class FermiCompilerStrategy implements CompilerStrategy {
    @Override
    public void compile() {
        System.out.println("Fermi Compiler: Compiling with nvcc for Fermi architecture...");
    }
}
