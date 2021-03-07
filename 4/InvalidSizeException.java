class InvalidSizeException extends Exception {
    // warning回避
    private static final long serialVersionUID = 1L;

    InvalidSizeException(String msg) {
        super(msg);
    }
}
