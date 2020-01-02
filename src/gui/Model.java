package gui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;

public class Model {
    private static boolean band = false;
    private static String path;
    public static void setPath(String ph){
        path = ph;
    }
    public static void setBand(boolean x){
        band = x;
    }
    public static String abrirNav(String usuario, String contrasena,String profesor){
       WebDriver driver = null;
       WebDriverWait wait = null;
       String mensajeError = "¡Error! verificar sus datos";
       ChromeOptions options = new ChromeOptions();
       options.addArguments(band ? "--headless" : "start-maximized");
       System.setProperty("webdriver.chrome.driver", path);
       try{
           driver = new ChromeDriver(options);
       }catch(RuntimeException ek){
       return "Seleccionar un driver valido";
       }
       wait = new WebDriverWait(driver,5);
       driver.get("https://eval.uv.mx/evaluacion/Estudiante/Estudiante");
       driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(usuario);
       driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(contrasena);
       driver.findElement(By.xpath("//*[@id=\"BtnLogin\"]")).click();
       String xPathPr = "//div[@class='card-user' and contains(.,'" + profesor.toUpperCase() + "')]";
       try{
           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(.,'Docentes')]")));
           driver.findElement(By.xpath(xPathPr)).click();
           evalOpciones(driver);
       }catch(Exception e){
           driver.close();
           return mensajeError;
       }
       driver.close();
       return "El programa ha terminado";
    }
    private static void evalOpciones(WebDriver driver){
        WebDriverWait waitA = new WebDriverWait(driver, 5);

        waitA.until(ExpectedConditions.elementToBeClickable(By.xpath("//h4[@class='mapaPreg']")));
    // 1
        driver.findElement(By.xpath("//*[@id=\"mapaReactivos\"]/form/div/div[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"btnPregSig\"]")).click();
    //2
       driver.findElement(By.xpath("//*[@id=\"btnPregSig\"]")).click();
    //3
        driver.findElement(By.xpath("//*[@id=\"mapaReactivos\"]/form/div/div[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"btnPregSig\"]")).click();
    //4
        driver.findElement(By.xpath("//*[@id=\"mapaReactivos\"]/form/div/div[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"btnPregSig\"]")).click();
    //5
        driver.findElement(By.xpath("//*[@id=\"mapaReactivos\"]/form/div/div[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"btnPregSig\"]")).click();
    //6
        driver.findElement(By.xpath("//*[@id=\"mapaReactivos\"]/form/div/div[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"btnPregSig\"]")).click();
        waitA.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mapaReactivos\"]/form/div/div[1]/label")));
    //6 - a1
        driver.findElement(By.xpath("//*[@id=\"btnPregSig\"]")).click();
    //7
        driver.findElement(By.xpath("//*[@id=\"btnPregSig\"]")).click();
    //8
        driver.findElement(By.xpath("//*[@id=\"mapaReactivos\"]/form/div/div[2]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"btnPregSig\"]")).click();
    //9
        driver.findElement(By.xpath("//*[@id=\"mapaReactivos\"]/form/div/div[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"btnPregSig\"]")).click();
    //10
        driver.findElement(By.xpath("//*[@id=\"mapaReactivos\"]/form/div/div[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"btnPregSig\"]")).click();

        waitA.until(ExpectedConditions.elementToBeClickable(By.xpath("//tr[@id='4859']")));
    //10 - a1
        driver.findElement(By.xpath("//*[@id=\"btnPregSig\"]")).click();
    //11
        driver.findElement(By.xpath("//*[@id=\"btnPregSig\"]")).click();
    //12
        driver.findElement(By.xpath("//*[@id=\"mapaReactivos\"]/form/div/div[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"btnPregSig\"]")).click();
        waitA.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mapaReactivos\"]/form/div/div[1]/label")));
        //12 - a1
        driver.findElement(By.xpath("//*[@id=\"mapaReactivos\"]/form/div/div[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"btnPregSig\"]")).click();
    //13
        driver.findElement(By.xpath("//*[@id=\"mapaReactivos\"]/form/div/div[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"btnPregSig\"]")).click();
    //14
        driver.findElement(By.xpath("//*[@id=\"mapaReactivos\"]/form/div/div[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"btnPregSig\"]")).click();
    //15
        driver.findElement(By.xpath("//*[@id=\"mapaReactivos\"]/form/div/div[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"btnPregSig\"]")).click();
    //16
        driver.findElement(By.xpath("//*[@id=\"btnPregSig\"]")).click();
    //17
        driver.findElement(By.xpath("//*[@id=\"4904\"]/td[2]/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"4905\"]/td[2]/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"4906\"]/td[2]/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"4907\"]/td[2]/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"4908\"]/td[2]/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"4909\"]/td[2]/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"4910\"]/td[2]/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"4911\"]/td[2]/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"btnPregSig\"]")).click();
    //18
        driver.findElement(By.xpath("//*[@id=\"mapaReactivos\"]/form/div/div[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"btnPregSig\"]")).click();
    //19
        driver.findElement(By.xpath("//*[@id=\"4916\"]/td[2]/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"4917\"]/td[2]/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"btnPregSig\"]")).click();
    //20
        driver.findElement(By.xpath("//*[@id=\"4918\"]/td[2]/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"4919\"]/td[2]/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"4920\"]/td[2]/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"btnPregSig\"]")).click();
    //21
        driver.findElement(By.xpath("//*[@id=\"R4921\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"btnPregSig\"]")).click();
    //22
        driver.findElement(By.xpath("//*[@id=\"mapaReactivos\"]/form/div/div[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"btnPregSig\"]")).click();
    //23
        driver.findElement(By.xpath("//*[@id=\"4925\"]/td[2]/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"4926\"]/td[2]/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"btnPregSig\"]")).click();
    //24
        driver.findElement(By.xpath("//*[@id=\"btnPregSig\"]")).click();
    //25
        driver.findElement(By.xpath("//*[@id=\"mapaReactivos\"]/form/div/div[2]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"btnPregSig\"]")).click();
    //26
        driver.findElement(By.xpath("//*[@id=\"mapaReactivos\"]/form/div/div[1]/label"));
        driver.findElement(By.xpath("//*[@id=\"btnPregSig\"]")).click();
    //27
        driver.findElement(By.xpath("//*[@id=\"btnPregSig\"]")).click();
    //28
    }
    public static String matarProceso() {
        String mensaje = "¡Eliminar proceso chromedriver manualmente!";
        String osName = System.getProperty("os.name");
        String cmd =  "";
        if(osName.toUpperCase().contains("WIN")){
            cmd ="tskill";
        }else if(osName.toUpperCase().contains("MAC")){
            cmd ="killall";
        }
        cmd+=" chromedriver";
        Process proceso;
        try {
            proceso = Runtime.getRuntime().exec(cmd);
            proceso.waitFor();
            if(proceso.exitValue()==0){
                mensaje = "proceso eliminado :)";
            }
        } catch (IOException e) {} catch (InterruptedException e) {}
        return mensaje;
    }


}
