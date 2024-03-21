package Seminar7.three;

public class DocumentAdapter implements Document{
    OldDocument oldDocument;
    
    public DocumentAdapter(OldDocument oldDocument) {
        this.oldDocument = oldDocument;
    }

    @Override
    public void open() {
        oldDocument.open();
    }

    @Override
    public void close() {
        oldDocument.close();
    }
    
}
