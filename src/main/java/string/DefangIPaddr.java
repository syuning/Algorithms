package main.java.string;

public class DefangIPaddr {
    public String defangIPaddr(String address) {
        String[] addr = address.split("\\.");
        String defangAddr = "";
        for (int i = 0; i < addr.length; i++) {
            defangAddr += i!= addr.length-1 ? (addr[i] + "[.]"): addr[i];
        }
        return defangAddr;
    }
}
