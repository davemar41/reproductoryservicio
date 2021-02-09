package com.example.reproductoryservicio

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class Miservicio : Service() {
    private  var  mp: MediaPlayer?=null
    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }

    override fun onStartCommand(intentservicio: Intent?, flags: Int, startId: Int): Int {
        var posicion = 0
        val mivariable= intentservicio?.extras?.get(Konstantes.Dato)
        when(mivariable){

            0->{
                if(mp==null){
                    mp=MediaPlayer.create(this,R.raw.buscando)
                }
                if(mp?.isPlaying==false){
                    mp?.seekTo(posicion)
                    mp?.start()
                }
            }

            1->{
                mp?.pause()
                mp?.seekTo(posicion)

            }
            2->{
                mp?.pause()
                posicion=0
                mp?.seekTo(0)
            }
            3->{
                Thread{
                    mp?.pause()
                    posicion=0
                    mp?.seekTo(0)
                    Thread.sleep(1500)
                }.start()
            }
        }

        return super.onStartCommand(intentservicio, flags, startId)
    }
}