package com.iomzn.java.apache.commons.lang;

import org.apache.commons.lang3.arch.Processor;

public class ApacheProcessor {

    public static void main(String[] args) {
        // processor - arch
        Processor.Arch arch01 = Processor.Arch.BIT_32;
        Processor.Arch arch02 = Processor.Arch.BIT_64;
        Processor.Arch arch03 = Processor.Arch.UNKNOWN;

        // processor - type
        Processor.Type type01 = Processor.Type.X86;
        Processor.Type type02 = Processor.Type.IA_64;
        Processor.Type type03 = Processor.Type.PPC;
        Processor.Type type04 = Processor.Type.UNKNOWN;

        // instance
        Processor processor = new Processor(Processor.Arch.BIT_64, Processor.Type.X86);

        Processor.Arch arch = processor.getArch(); // Processor.Arch.BIT_64,
        Processor.Type type = processor.getType(); // Processor.Type.X86

        boolean is32Bit = processor.is32Bit(); // false
        boolean is64Bit = processor.is64Bit(); // true
        boolean isX86 = processor.isX86(); // true
        boolean isIA64 = processor.isIA64(); // false
        boolean isPPC =processor.isPPC(); // false
    }
}
