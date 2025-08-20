// Base class
abstract class BioSequence {
    String sequence;

    BioSequence(String sequence) {
        this.sequence = sequence;
    }

    // Method to be overridden
    abstract void analyze();
}

// DNA subclass
class DNA extends BioSequence {
    DNA(String sequence) {
        super(sequence);
    }

    @Override
    void analyze() {
        int gcCount = 0;
        for (char base : sequence.toCharArray()) {
            if (base == 'G' || base == 'C') gcCount++;
        }
        double gcContent = (gcCount * 100.0) / sequence.length();
        System.out.println("DNA sequence GC-content: " + gcContent + "%");
    }
}

// RNA subclass
class RNA extends BioSequence {
    RNA(String sequence) {
        super(sequence);
    }

    @Override
    void analyze() {
        int uCount = 0;
        for (char base : sequence.toCharArray()) {
            if (base == 'U') uCount++;
        }
        System.out.println("RNA sequence U-count: " + uCount);
    }
}

// Protein subclass
class Protein extends BioSequence {
    Protein(String sequence) {
        super(sequence);
    }

    @Override
    void analyze() {
        System.out.println("Protein length: " + sequence.length() + " amino acids.");
    }
}

// Main class
public class BioPolymorphism {
    public static void main(String[] args) {
        // Polymorphic behavior
        BioSequence s1 = new DNA("ATGCGTACGTTAGC");
        BioSequence s2 = new RNA("AUGCUUACGUAU");
        BioSequence s3 = new Protein("MTEYKLVVVGAGGVGKSALTIQLIQ");

        // Same method, different behavior
        s1.analyze();
        s2.analyze();
        s3.analyze();
    }
}
