package HibernateDemo.demo.model;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class BooleanToStringConverter implements AttributeConverter<Boolean,String> {
    @Override
    public String convertToDatabaseColumn(Boolean attribute) {
        if(attribute==null){
            return null;
            }
        if(attribute==true){
            return "YES";
        }
        return "NO";
    }

    @Override
    public Boolean convertToEntityAttribute(String dbData) {
        if(dbData.equals("YES")){
            return  true;
        }
        return false;
    }
}
