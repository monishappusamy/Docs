class RandomGeneratorLibrary{
    /**
     * Use this method if you want a random number that doesn't repeat again + If 
     * you are ok using timestamp to provide this functionality
     * 
     * @return Current timestamp as String
     *
     */
    public String generateReasonablyRandomID() {
            // Using current Timestamp for producing random ID
            SimpleDateFormat simpleDateFormat =  new SimpleDateFormat("yyyyMMddhhmmss");
            String dateAsString = simpleDateFormat.format(new Date());
            return "Monish" + dateAsString;
    }
}
