package interviews;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

public class SerialMapper {
    static List<String> serials = List.of("Breaking Bad (2008-2013)[http://kinopisk.ru/1.html", "The lost (2006-2010)[http://imdb/222.html]", "Escape (2005-2010)[http://hello.html]");

    public static void main(String[] args) {
        serials.stream()
                .map(SerialMapper::parseSerial)
                .forEach(System.out::println);
    }

    private static Serial parseSerial(String serial) {
        Serial newSerial = new Serial();
        newSerial.setTitle(serial.substring(0, serial.indexOf('(')).trim());
        newSerial.setYearStart(Integer.parseInt(serial.substring(serial.indexOf('(') + 1, serial.indexOf('-'))));
        newSerial.setYearEnd(Integer.parseInt(serial.substring(serial.indexOf('-') + 1, serial.indexOf(')'))));
        newSerial.setUrl(serial.substring(serial.indexOf('[') + 1, serial.lastIndexOf('l') + 1));
        return newSerial;
    }
}

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
class Serial {
    private String title;
    private int yearStart;
    private int yearEnd;
    private String url;

}
