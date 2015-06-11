package com.example.blancai.sensores;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;


public class MainActivity extends ActionBarActivity implements SensorEventListener {

    private TextView salida;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//aqui se declaran las varibles
        salida = (TextView) findViewById(R.id.salida);


//aqui se mandan a llamar los servicios de sensores
        SensorManager sensorManager = (sensorManager) getSystemService(SENSOR_SERVICE);

        List<Sensor> listaSensores = sensorManager.getSensorList(Sensor.TYPE_ALL);

        for (Sensor sensor: listaSensores){
            log(sensor.getName());

        }
    }

//aqui se inician los sensores
    public void  iniciarsensores(){


        SensorManager sensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);

        List<Sensor> listaSensores = sensorManager.getSensorList(Sensor.TYPE_ALL);
//aqui se manda a llamr el sensor de orientacion
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_ORIENTATION);

                if (!listaSensores.isEmpty()) {
                    Sensor oriSensor = listaSensores.get(0);
                    sensorManager.registerListener(this, oriSensor,
                            SensorManager.SENSOR_DELAY_UI);}
//aqui se manda a llamr el sensor de acelerometro
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_ACCELEROMETER);


        if (!listaSensores.isEmpty()) {
            Sensor aceSensor = listaSensores.get(0);
            sensorManager.registerListener(this, aceSensor,
                    SensorManager.SENSOR_DELAY_NORMAL);}
        // se manda a llamr el sensor de gyroscopio
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_GYROSCOPE);


        if (!listaSensores.isEmpty()) {
            Sensor giroSensor = listaSensores.get(0);
            sensorManager.registerListener(this, giroSensor,
                    SensorManager.SENSOR_DELAY_UI);}
//aqui se manda a llamr el sensor de magnetic
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_MAGNETIC_FIELD);

        if (!listaSensores.isEmpty()) {

            Sensor magSensor = listaSensores.get(0);
            sensorManager.registerListener(this, magSensor,
                    SensorManager.SENSOR_DELAY_NORMAL);}
//aqui se manda a llamr el sensor de temperatura
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_TEMPERATURE);

        if (!listaSensores.isEmpty()) {

            Sensor temSensor = listaSensores.get(0);
            sensorManager.registerListener(this, temSensor,
                    SensorManager.SENSOR_DELAY_NORMAL);}
//aqui se manda a llamr el sensor de proximity
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_PROXIMITY);

        if (!listaSensores.isEmpty()) {

            Sensor proSensor = listaSensores.get(0);
            sensorManager.registerListener(this, proSensor,
                    SensorManager.SENSOR_DELAY_NORMAL);}

//aqui se manda a llamr el sensor de gravity
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_GRAVITY);

        if (!listaSensores.isEmpty()) {

            Sensor graSensor = listaSensores.get(0);
            sensorManager.registerListener(this, graSensor,
                    SensorManager.SENSOR_DELAY_NORMAL);}
//aqui se manda a llamr el sensor de luz
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_LIGHT);

        if (!listaSensores.isEmpty()) {

            Sensor liSensor = listaSensores.get(0);
            sensorManager.registerListener(this, liSensor,
                    SensorManager.SENSOR_DELAY_NORMAL);}




    }

//aqui se detienen los sensores
    public void detenerSensores(){

        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

        List<Sensor> listaSensores = sensorManager.getSensorList(Sensor.TYPE_ALL);
//aqui se detiene el sensor de orientacion
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_ORIENTATION);

        if (!listaSensores.isEmpty()){
            Sensor oriSensor= listaSensores.get(0);
            sensorManager.unregisterListener(this, sensorManager.getDefaultSensor(oriSensor.TYPE_ORIENTATION));

        }
//aqui se detiene el sensor de acelerometro
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_ACCELEROMETER);

        if (!listaSensores.isEmpty()){
            Sensor aceSensor = listaSensores.get(0);
            sensorManager.unregisterListener(this, sensorManager.getDefaultSensor(aceSensor.TYPE_ACCELEROMETER));
        }

////aqui se detiene el sensor de gyroscopio
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_GYROSCOPE);

        if (!listaSensores.isEmpty()){
            Sensor gisSensor = listaSensores.get(0);
            sensorManager.unregisterListener(this, sensorManager.getDefaultSensor(gisSensor.TYPE_GYROSCOPE));

        }
//aqui se detiene el sensor magnetico
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_MAGNETIC_FIELD);

        if (!listaSensores.isEmpty()){
            Sensor macSensor = listaSensores.get(0);
            sensorManager.unregisterListener(this, sensorManager.getDefaultSensor(macSensor.TYPE_MAGNETIC_FIELD));

        }
//aqui se detiene el sensor de temperatura
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_TEMPERATURE);

        if (!listaSensores.isEmpty()){
            Sensor temSensor = listaSensores.get(0);
            sensorManager.unregisterListener(this, sensorManager.getDefaultSensor(temSensor.TYPE_TEMPERATURE));

        }
//aqui se detiene el sensor de proximidad
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_PROXIMITY);

        if (!listaSensores.isEmpty()){
            Sensor proSensor = listaSensores.get(0);
            sensorManager.unregisterListener(this, sensorManager.getDefaultSensor(proSensor.TYPE_PROXIMITY));

        }
//aqui se detiene el sensor de gravedad
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_GRAVITY);

        if (!listaSensores.isEmpty()){
            Sensor graSensor = listaSensores.get(0);
            sensorManager.unregisterListener(this, sensorManager.getDefaultSensor(graSensor.TYPE_GRAVITY));

        }
//aqui se detiene el sensor de giroscopio
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_GYROSCOPE);

        if (!listaSensores.isEmpty()){
            Sensor gisSensor = listaSensores.get(0);
            sensorManager.unregisterListener(this, sensorManager.getDefaultSensor(gisSensor.TYPE_GYROSCOPE));

        }
//aqui se detiene el sensor de luz
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_LIGHT);

        if (!listaSensores.isEmpty()){
            Sensor liSensor = listaSensores.get(0);
            sensorManager.unregisterListener(this, sensorManager.getDefaultSensor(liSensor.TYPE_LIGHT));

        }



    }

    @Override
    public void onSensorChanged(SensorEvent event){
        synchronized (this) {
            switch(event.sensor.getType()){
                case Sensor.TYPE_ORIENTATION:

                    break;
                //aqui se mustran los valores obtenidos del sensor de orientacion
                case Sensor.TYPE_ACCELEROMETER:
                    log("Acelerometro X: "+event.values[0]);
                    log("Acelerometro Y: "+event.values[1]);
                    log("Acelerometro Z: "+event.values[2]);
                    break;
                //aqui se mustran los valores obtenidos del sensor del giroscopio
                case Sensor.TYPE_GYROSCOPE:
                    log("Eje X: "+event.values[0]);
                    log("Eje Y: "+event.values[1]);
                    log("Eje Z: "+event.values[2]);
                    break;
                //aqui se mustran los valores obtenidos del sensor de magnetico
                case Sensor.TYPE_MAGNETIC_FIELD:
                    log("Eje X: "+event.values[0]);
                    log("Eje Y: "+event.values[1]);
                    log("Eje Z: "+event.values[2]);
                    break;

                //aqui se mustran los valores obtenidos del sensor de proximidad
                case Sensor.TYPE_PROXIMITY:
                    log("Proximidad: " +event.values[0]);
                    break;
                //aqui se mustran los valores obtenidos del sensor de luz
                case  Sensor.TYPE_LIGHT:

                    break;
                //aqui se mustran los valores obtenidos del sensor de gravedad
                case Sensor.TYPE_GRAVITY:

                    break;
                default:
                    //el sensor de temperatura se toma el valor
                    for (int i=0 ; i <event.values.length ; i++){
                        log("Temperatura"+i+": "+event.values[i]);
                    }



            }
        }
    }

@Override
public void onAccuracyChanged(Sensor sensor, int accuracy){

}

    private void log (String string) { salida.append(string + "\n");}
//aqui se limpian los datos obtenidos
    private void limpiar() { salida.setText("");}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()){
            case R.id.iniciar:
                iniciarsensores();
                return true;
            case R.id.detener:
                detenerSensores();
                return true;
            case R.id.limpiar:
                limpiar();
                return true;
            default:
        }

        return super.onOptionsItemSelected(item);
    }
}
