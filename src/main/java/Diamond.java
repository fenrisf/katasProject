class Diamond {
    public static String print(int n) {
        if(n%2==0 || n<0)
            return null;
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i < (n+1); i += 2) {
            for (int j = 0; j < (n - i) / 2; j++){
                sb.append(" ");
            }
            for (int j = 0; j < i; j++){
                sb.append("*");
            }
            sb.append("\n");
        }

        for (int i = (n-2); i > 0; i -= 2) {
            for (int j = 0; j < (n - i) / 2; j++) {
                sb.append(" ");
            }
            for (int j = 0; j < i; j++) {
                sb.append("*");
            }

            sb.append("\n");
        }
        return sb.toString();
    }
}
