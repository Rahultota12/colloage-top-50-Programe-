class removespace38 {
    public static void main(String[] args)
    {
        String str = "Rahul    tota    It   Diploma  ";
        str = str.replaceAll("\\s", "");
 
        System.out.println(str);
    }
}