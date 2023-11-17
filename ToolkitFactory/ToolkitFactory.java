package ToolkitFactory;

import CardFamily.*;
import Management.NvidiaToolkit;

public class ToolkitFactory {
    public NvidiaToolkit createToolkit(String type) {
        GraphicsCardFamily cardFamily;
        switch (type) {
            case "Tesla":
                cardFamily = new TeslaFamily();
                break;
            case "Fermi":
                cardFamily = new FermiFamily();
                break;
            case "Pascal":
                cardFamily = new PascalFamily();
                break;
            default:
                throw new IllegalArgumentException("Unknown family type: " + type);
        }
        return cardFamily.createToolkit();
    }
}
