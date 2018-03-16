package app.jobs;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class MeuJOB {

   // private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    
    // @Scheduled ( cron  =  "[Segundos] [Minutos] [Horas] [Dia do mês] [Mês] [Dia da semana] [Ano]" )
    @Scheduled(cron = "15 35 10 * * ?")
    public void reportCurrentTime() {
       // log.info("The time is now {}", dateFormat.format(new Date()));
        System.out.println("teste");
    }

}
