package demo.pv10springdatarepositories;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class SeedDb {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void init(){
//        jdbcTemplate.update("insert into RECIPES (name, type, spice_level) values (?, ?, ?)", "Chicken masala", "NONVEG", "LOW");
//        jdbcTemplate.update("insert into RECIPES (name, type, spice_level) values (?, ?, ?)", new Object[]{"Chicken masala", "NONVEG", "LOW"});
//        jdbcTemplate.update("insert into RECIPES (name, type, spice_level) values (?, ?, ?)", new Object[]{"Chicken Schezuan", "NONVEG", "LOW"});
//        jdbcTemplate.update("insert into RECIPES (name, type, spice_level) values (?, ?, ?)", new Object[]{"Veg Schezuan", "VEG", "MID"});
//        jdbcTemplate.update("insert into RECIPES (name, type, spice_level) values (?, ?, ?)", new Object[]{"Veg Hakka", "VEG", "MID"});
//        jdbcTemplate.update("insert into RECIPES (name) values (?, ?, >)", new Object[]{"Chicken Schezuan", "NONVEG", "LOW"});

//        INSERT INTO LUMINATE_EXTERNAL_DATA_LINX.TJM_MESSAGE_OUTBOUND (ID, VERSION, CREATED_DATE_TIME, UPDATED_DATE_TIME, MESSAGE, STATUS, FAILURE_REASON)
//        VALUES (8,
//                0,
//                '2018-08-02T14:00:00',
//                '2018-08-02T14:00:05',
//                '<?xml version="1.0" encoding="UTF-8" standalone="yes"?> <ns1:TrainJourneyModificationMessage xmlns:ns1="http://www.era.europa.eu/schemes/TAFTSI/5.3"> <ns1:MessageHeader> <ns1:MessageReference> <ns1:MessageType>9004</ns1:MessageType> <ns1:MessageTypeVersion>5.3.1.GB</ns1:MessageTypeVersion> <ns1:MessageIdentifier>74d7be8e-f15c-4711-9f91-f12015d1f837</ns1:MessageIdentifier> <ns1:MessageDateTime>2018-09-20T12:30:00Z</ns1:MessageDateTime> </ns1:MessageReference> <ns1:Sender ns1:CI_InstanceNumber="01">0070</ns1:Sender> <ns1:Recipient ns1:CI_InstanceNumber="01">0070</ns1:Recipient> </ns1:MessageHeader> <ns1:MessageStatus>1</ns1:MessageStatus> <ns1:OperationalTrainNumberIdentifier> <ns1:OperationalTrainNumber>2H66</ns1:OperationalTrainNumber> </ns1:OperationalTrainNumberIdentifier> <ns1:TrainJourneyModification> <ns1:TrainJourneyModificationIndicator>1</ns1:TrainJourneyModificationIndicator> <ns1:LocationModified> <ns1:Location> <ns1:CountryCodeISO>GB</ns1:CountryCodeISO> <ns1:LocationPrimaryCode>2</ns1:LocationPrimaryCode> </ns1:Location> <ns1:ModificationStatusIndicator>0</ns1:ModificationStatusIndicator> </ns1:LocationModified> </ns1:TrainJourneyModification> </ns1:TrainJourneyModificationMessage>',
//                'SUCCESS',
//                null);
    }
}
