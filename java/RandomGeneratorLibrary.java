class RandomGeneratorLibrary{
    public String generateReasonablyID() {
            // Using current Timestamp for producing random ID
            SimpleDateFormat simpleDateFormat =  new SimpleDateFormat("yyyyMMddhhmmss");
            String dateAsString = simpleDateFormat.format(new Date());
            return "Monish" + dateAsString;
    }
}
