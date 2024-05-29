package app.mathgames;

import android.content.Intent;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.internal.view.SupportMenu;



public class layoutsubtraction extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {
    private ImageView imaigual;
    private Boolean loaded;
    private TextView opcion1;
    private TextView opcion2;
    private TextView opcion3;
    private ImageView primerdigito;
    private ImageView segundodigito;
    private TextView siguiente;
    private int soundCorrect;
    private SoundPool soundPool;

   
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.layoutsubtraction);
       
        this.primerdigito = (ImageView) findViewById(R.id.primerdigito);
        this.segundodigito = (ImageView) findViewById(R.id.segundodigito);
        this.imaigual = (ImageView) findViewById(R.id.imaigual);
        this.opcion1 =  findViewById(R.id.opcion1);
        this.opcion2 =  findViewById(R.id.opcion2);
        this.opcion3 =  findViewById(R.id.opcion3);
        this.siguiente =  findViewById(R.id.siguiente);
        this.opcion1.setOnClickListener(this);
        this.opcion2.setOnClickListener(this);
        this.opcion3.setOnClickListener(this);
        this.siguiente.setOnClickListener(this);
        setVolumeControlStream(3);
        SoundPool soundPool2 = new SoundPool(10, 3, 0);
        this.soundPool = soundPool2;
        soundPool2.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
            

            public void onLoadComplete(SoundPool soundPool, int i, int i2) {
                loaded = true;
            }
        });
        this.soundCorrect = this.soundPool.load(this, R.raw.correct, 1);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        float streamVolume = ((float) audioManager.getStreamVolume(3)) / ((float) audioManager.getStreamMaxVolume(3));
        if (!this.loaded.booleanValue()) {
            return false;
        }
        this.soundPool.play(this.soundCorrect, streamVolume, streamVolume, 1, 0, 1.0f);
        return false;
    }

    @Override 
    public void onStart() {
        super.onStart();
        this.primerdigito.startAnimation(AnimationUtils.loadAnimation(this, R.anim.uptodown));
        this.segundodigito.startAnimation(AnimationUtils.loadAnimation(this, R.anim.downtoup));
        this.imaigual.startAnimation(AnimationUtils.loadAnimation(this, R.anim.scaleequal));
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id != R.id.siguiente) {
            if(id==R.id.opcion1){
                this.opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                
            }else if(id==R.id.opcion2){
                this.opcion2.setBackgroundColor(-16711936);
                this.opcion2.startAnimation(AnimationUtils.loadAnimation(this, R.anim.goodgame));
                this.soundPool.play(this.soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
            }else if(id==R.id.opcion3){
                this.opcion3.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                
            }
           
        } else {
            onStart();
            this.opcion1.setText("5");
            this.opcion2.setText("1");
            this.opcion3.setText("4");
            this.opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
            this.opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
            this.opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
            this.primerdigito.setImageResource(R.drawable.gamenumber3);
            this.segundodigito.setImageResource(R.drawable.gamenumber2);
            this.opcion1.setOnClickListener(new View.OnClickListener() {
                

                public void onClick(View view) {
                    opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                }
            });
            this.opcion2.setOnClickListener(new View.OnClickListener() {
                

                public void onClick(View view) {
                    opcion2.setBackgroundColor(-16711936);
                    opcion2.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                    soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                }
            });
            this.opcion3.setOnClickListener(new View.OnClickListener() {
                

                public void onClick(View view) {
                    opcion3.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                }
            });
            this.siguiente.setOnClickListener(new View.OnClickListener() {
                

                public void onClick(View view) {
                    onStart();
                    opcion1.setText("3");
                    opcion2.setText("4");
                    opcion3.setText("7");
                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                    primerdigito.setImageResource(R.drawable.gamenumber5);
                    segundodigito.setImageResource(R.drawable.gamenumber2);
                    opcion1.setOnClickListener(new View.OnClickListener() {
                        

                        public void onClick(View view) {
                            opcion1.setBackgroundColor(-16711936);
                            opcion1.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                            soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                        }
                    });
                    opcion2.setOnClickListener(new View.OnClickListener() {
                        

                        public void onClick(View view) {
                            opcion2.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                        }
                    });
                    opcion3.setOnClickListener(new View.OnClickListener() {
                        

                        public void onClick(View view) {
                            opcion3.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                        }
                    });
                    siguiente.setOnClickListener(new View.OnClickListener() {
                        

                        public void onClick(View view) {
                            onStart();
                            opcion1.setText("5");
                            opcion2.setText("3");
                            opcion3.setText("4");
                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                            primerdigito.setImageResource(R.drawable.gamenumber7);
                            segundodigito.setImageResource(R.drawable.gamenumber3);
                            opcion1.setOnClickListener(new View.OnClickListener() {
                                

                                public void onClick(View view) {
                                    opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                }
                            });
                            opcion2.setOnClickListener(new View.OnClickListener() {
                                

                                public void onClick(View view) {
                                    opcion2.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                }
                            });
                            opcion3.setOnClickListener(new View.OnClickListener() {
                                

                                public void onClick(View view) {
                                    opcion3.setBackgroundColor(-16711936);
                                    opcion3.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                    soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                }
                            });
                            siguiente.setOnClickListener(new View.OnClickListener() {
                                

                                public void onClick(View view) {
                                    onStart();
                                    opcion1.setText("5");
                                    opcion2.setText("2");
                                    opcion3.setText("3");
                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                    primerdigito.setImageResource(R.drawable.gamenumber6);
                                    segundodigito.setImageResource(R.drawable.gamenumber4);
                                    opcion1.setOnClickListener(new View.OnClickListener() {
                                        

                                        public void onClick(View view) {
                                            opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                        }
                                    });
                                    opcion2.setOnClickListener(new View.OnClickListener() {
                                        

                                        public void onClick(View view) {
                                            opcion2.setBackgroundColor(-16711936);
                                            opcion2.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                            soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                        }
                                    });
                                    opcion3.setOnClickListener(new View.OnClickListener() {
                                        

                                        public void onClick(View view) {
                                            opcion3.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                        }
                                    });
                                    siguiente.setOnClickListener(new View.OnClickListener() {
                                        

                                        public void onClick(View view) {
                                            onStart();
                                            opcion1.setText("0");
                                            opcion2.setText("4");
                                            opcion3.setText("1");
                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                            primerdigito.setImageResource(R.drawable.gamenumber2);
                                            segundodigito.setImageResource(R.drawable.gamenumber2);
                                            opcion1.setOnClickListener(new View.OnClickListener() {
                                                

                                                public void onClick(View view) {
                                                    opcion1.setBackgroundColor(-16711936);
                                                    opcion1.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                    soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                }
                                            });
                                            opcion2.setOnClickListener(new View.OnClickListener() {
                                                

                                                public void onClick(View view) {
                                                    opcion2.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                }
                                            });
                                            opcion3.setOnClickListener(new View.OnClickListener() {
                                                

                                                public void onClick(View view) {
                                                    opcion3.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                }
                                            });
                                            siguiente.setOnClickListener(new View.OnClickListener() {
                                                

                                                public void onClick(View view) {
                                                    onStart();
                                                    opcion1.setText("2");
                                                    opcion2.setText("1");
                                                    opcion3.setText("5");
                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                    primerdigito.setImageResource(R.drawable.gamenumber4);
                                                    segundodigito.setImageResource(R.drawable.gamenumber3);
                                                    opcion1.setOnClickListener(new View.OnClickListener() {
                                                        

                                                        public void onClick(View view) {
                                                            opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                        }
                                                    });
                                                    opcion2.setOnClickListener(new View.OnClickListener() {
                                                        

                                                        public void onClick(View view) {
                                                            opcion2.setBackgroundColor(-16711936);
                                                            opcion2.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                            soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                        }
                                                    });
                                                    opcion3.setOnClickListener(new View.OnClickListener() {
                                                        

                                                        public void onClick(View view) {
                                                            opcion3.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                        }
                                                    });
                                                    siguiente.setOnClickListener(new View.OnClickListener() {
                                                        

                                                        public void onClick(View view) {
                                                            onStart();
                                                            opcion1.setText("6");
                                                            opcion2.setText("4");
                                                            opcion3.setText("5");
                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                            primerdigito.setImageResource(R.drawable.gamenumber8);
                                                            segundodigito.setImageResource(R.drawable.gamenumber3);
                                                            opcion1.setOnClickListener(new View.OnClickListener() {
                                                                

                                                                public void onClick(View view) {
                                                                    opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                }
                                                            });
                                                            opcion2.setOnClickListener(new View.OnClickListener() {
                                                                

                                                                public void onClick(View view) {
                                                                    opcion2.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                }
                                                            });
                                                            opcion3.setOnClickListener(new View.OnClickListener() {
                                                                

                                                                public void onClick(View view) {
                                                                    opcion3.setBackgroundColor(-16711936);
                                                                    opcion3.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                    soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                }
                                                            });
                                                            siguiente.setOnClickListener(new View.OnClickListener() {
                                                                

                                                                public void onClick(View view) {
                                                                    onStart();
                                                                    opcion1.setText("2");
                                                                    opcion2.setText("1");
                                                                    opcion3.setText("3");
                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                    primerdigito.setImageResource(R.drawable.gamenumber5);
                                                                    segundodigito.setImageResource(R.drawable.gamenumber4);
                                                                    opcion1.setOnClickListener(new View.OnClickListener() {
                                                                        

                                                                        public void onClick(View view) {
                                                                            opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                        }
                                                                    });
                                                                    opcion2.setOnClickListener(new View.OnClickListener() {
                                                                        

                                                                        public void onClick(View view) {
                                                                            opcion2.setBackgroundColor(-16711936);
                                                                            opcion2.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                            soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                        }
                                                                    });
                                                                    opcion3.setOnClickListener(new View.OnClickListener() {
                                                                        

                                                                        public void onClick(View view) {
                                                                            opcion3.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                        }
                                                                    });
                                                                    siguiente.setOnClickListener(new View.OnClickListener() {
                                                                        

                                                                        public void onClick(View view) {
                                                                            onStart();
                                                                            opcion1.setText("2");
                                                                            opcion2.setText("3");
                                                                            opcion3.setText("9");
                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                            primerdigito.setImageResource(R.drawable.gamenumber7);
                                                                            segundodigito.setImageResource(R.drawable.gamenumber5);
                                                                            opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                

                                                                                public void onClick(View view) {
                                                                                    opcion1.setBackgroundColor(-16711936);
                                                                                    opcion1.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                    soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                }
                                                                            });
                                                                            opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                

                                                                                public void onClick(View view) {
                                                                                    opcion2.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                }
                                                                            });
                                                                            opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                

                                                                                public void onClick(View view) {
                                                                                    opcion3.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                }
                                                                            });
                                                                            siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                

                                                                                public void onClick(View view) {
                                                                                    onStart();
                                                                                    opcion1.setText("7");
                                                                                    opcion2.setText("4");
                                                                                    opcion3.setText("5");
                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                    primerdigito.setImageResource(R.drawable.gamenumber6);
                                                                                    segundodigito.setImageResource(R.drawable.gamenumber1);
                                                                                    opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                        

                                                                                        public void onClick(View view) {
                                                                                            opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                        }
                                                                                    });
                                                                                    opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                        

                                                                                        public void onClick(View view) {
                                                                                            opcion2.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                        }
                                                                                    });
                                                                                    opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                        

                                                                                        public void onClick(View view) {
                                                                                            opcion3.setBackgroundColor(-16711936);
                                                                                            opcion3.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                            soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                        }
                                                                                    });
                                                                                    siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                        

                                                                                        public void onClick(View view) {
                                                                                            onStart();
                                                                                            opcion1.setText("7");
                                                                                            opcion2.setText("5");
                                                                                            opcion3.setText("6");
                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                            primerdigito.setImageResource(R.drawable.gamenumber9);
                                                                                            segundodigito.setImageResource(R.drawable.gamenumber2);
                                                                                            opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                

                                                                                                public void onClick(View view) {
                                                                                                    opcion1.setBackgroundColor(-16711936);
                                                                                                    opcion1.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                    soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                }
                                                                                            });
                                                                                            opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                

                                                                                                public void onClick(View view) {
                                                                                                    opcion2.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                }
                                                                                            });
                                                                                            opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                

                                                                                                public void onClick(View view) {
                                                                                                    opcion3.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                }
                                                                                            });
                                                                                            siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                

                                                                                                public void onClick(View view) {
                                                                                                    onStart();
                                                                                                    opcion1.setText("1");
                                                                                                    opcion2.setText("0");
                                                                                                    opcion3.setText("2");
                                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                    primerdigito.setImageResource(R.drawable.gamenumber4);
                                                                                                    segundodigito.setImageResource(R.drawable.gamenumber4);
                                                                                                    opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                        

                                                                                                        public void onClick(View view) {
                                                                                                            opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                        }
                                                                                                    });
                                                                                                    opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                        

                                                                                                        public void onClick(View view) {
                                                                                                            opcion2.setBackgroundColor(-16711936);
                                                                                                            opcion2.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                            soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                        }
                                                                                                    });
                                                                                                    opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                        

                                                                                                        public void onClick(View view) {
                                                                                                            opcion3.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                        }
                                                                                                    });
                                                                                                    siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                        

                                                                                                        public void onClick(View view) {
                                                                                                            onStart();
                                                                                                            opcion1.setText("2");
                                                                                                            opcion2.setText("7");
                                                                                                            opcion3.setText("3");
                                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                            primerdigito.setImageResource(R.drawable.gamenumber8);
                                                                                                            segundodigito.setImageResource(R.drawable.gamenumber6);
                                                                                                            opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                                

                                                                                                                public void onClick(View view) {
                                                                                                                    opcion1.setBackgroundColor(-16711936);
                                                                                                                    opcion1.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                                    soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                                }
                                                                                                            });
                                                                                                            opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                                

                                                                                                                public void onClick(View view) {
                                                                                                                    opcion2.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                }
                                                                                                            });
                                                                                                            opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                                

                                                                                                                public void onClick(View view) {
                                                                                                                    opcion3.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                }
                                                                                                            });
                                                                                                            siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                                

                                                                                                                public void onClick(View view) {
                                                                                                                    onStart();
                                                                                                                    opcion1.setText("8");
                                                                                                                    opcion2.setText("5");
                                                                                                                    opcion3.setText("7");
                                                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                    primerdigito.setImageResource(R.drawable.gamenumber9);
                                                                                                                    segundodigito.setImageResource(R.drawable.gamenumber2);
                                                                                                                    opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                                        

                                                                                                                        public void onClick(View view) {
                                                                                                                            opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                        }
                                                                                                                    });
                                                                                                                    opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                                        

                                                                                                                        public void onClick(View view) {
                                                                                                                            opcion2.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                        }
                                                                                                                    });
                                                                                                                    opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                                        

                                                                                                                        public void onClick(View view) {
                                                                                                                            opcion3.setBackgroundColor(-16711936);
                                                                                                                            opcion3.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                                            soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                                        }
                                                                                                                    });
                                                                                                                    siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                                        

                                                                                                                        public void onClick(View view) {
                                                                                                                            onStart();
                                                                                                                            opcion1.setText("9");
                                                                                                                            opcion2.setText("7");
                                                                                                                            opcion3.setText("8");
                                                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                            primerdigito.setImageResource(R.drawable.gamenumber12);
                                                                                                                            segundodigito.setImageResource(R.drawable.gamenumber3);
                                                                                                                            opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                

                                                                                                                                public void onClick(View view) {
                                                                                                                                    opcion1.setBackgroundColor(-16711936);
                                                                                                                                    opcion1.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                                                    soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                                                }
                                                                                                                            });
                                                                                                                            opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                

                                                                                                                                public void onClick(View view) {
                                                                                                                                    opcion2.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                }
                                                                                                                            });
                                                                                                                            opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                

                                                                                                                                public void onClick(View view) {
                                                                                                                                    opcion3.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                }
                                                                                                                            });
                                                                                                                            siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                                                

                                                                                                                                public void onClick(View view) {
                                                                                                                                    onStart();
                                                                                                                                    opcion1.setText("5");
                                                                                                                                    opcion2.setText("3");
                                                                                                                                    opcion3.setText("4");
                                                                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                    primerdigito.setImageResource(R.drawable.gamenumber10);
                                                                                                                                    segundodigito.setImageResource(R.drawable.gamenumber7);
                                                                                                                                    opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        

                                                                                                                                        public void onClick(View view) {
                                                                                                                                            opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                    opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        

                                                                                                                                        public void onClick(View view) {
                                                                                                                                            opcion2.setBackgroundColor(-16711936);
                                                                                                                                            opcion2.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                                                            soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                    opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        

                                                                                                                                        public void onClick(View view) {
                                                                                                                                            opcion3.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                    siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                                                        

                                                                                                                                        public void onClick(View view) {
                                                                                                                                            onStart();
                                                                                                                                            opcion1.setText("8");
                                                                                                                                            opcion2.setText("9");
                                                                                                                                            opcion3.setText("7");
                                                                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                            primerdigito.setImageResource(R.drawable.gamenumber15);
                                                                                                                                            segundodigito.setImageResource(R.drawable.gamenumber8);
                                                                                                                                            opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                

                                                                                                                                                public void onClick(View view) {
                                                                                                                                                    opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                }
                                                                                                                                            });
                                                                                                                                            opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                

                                                                                                                                                public void onClick(View view) {
                                                                                                                                                    opcion2.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                }
                                                                                                                                            });
                                                                                                                                            opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                

                                                                                                                                                public void onClick(View view) {
                                                                                                                                                    opcion3.setBackgroundColor(-16711936);
                                                                                                                                                    opcion3.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                                                                    soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                                                                }
                                                                                                                                            });
                                                                                                                                            siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                

                                                                                                                                                public void onClick(View view) {
                                                                                                                                                    onStart();
                                                                                                                                                    opcion1.setText("1");
                                                                                                                                                    opcion2.setText("0");
                                                                                                                                                    opcion3.setText("2");
                                                                                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                    primerdigito.setImageResource(R.drawable.gamenumber9);
                                                                                                                                                    segundodigito.setImageResource(R.drawable.gamenumber9);
                                                                                                                                                    opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                        

                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                            opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                    opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                        

                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                            opcion2.setBackgroundColor(-16711936);
                                                                                                                                                            opcion2.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                                                                            soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                    opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                        

                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                            opcion3.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                    siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                        

                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                            onStart();
                                                                                                                                                            opcion1.setText("4");
                                                                                                                                                            opcion2.setText("3");
                                                                                                                                                            opcion3.setText("2");
                                                                                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                            primerdigito.setImageResource(R.drawable.gamenumber12);
                                                                                                                                                            segundodigito.setImageResource(R.drawable.gamenumber10);
                                                                                                                                                            opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                

                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                    opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                }
                                                                                                                                                            });
                                                                                                                                                            opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                

                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                    opcion2.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                }
                                                                                                                                                            });
                                                                                                                                                            opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                

                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                    opcion3.setBackgroundColor(-16711936);
                                                                                                                                                                    opcion3.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                                                                                    soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                                                                                }
                                                                                                                                                            });
                                                                                                                                                            siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                

                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                    onStart();
                                                                                                                                                                    opcion1.setText("6");
                                                                                                                                                                    opcion2.setText("5");
                                                                                                                                                                    opcion3.setText("7");
                                                                                                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                    primerdigito.setImageResource(R.drawable.gamenumber16);
                                                                                                                                                                    segundodigito.setImageResource(R.drawable.gamenumber10);
                                                                                                                                                                    opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                        

                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                            opcion1.setBackgroundColor(-16711936);
                                                                                                                                                                            opcion1.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                                                                                            soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                                                                                        }
                                                                                                                                                                    });
                                                                                                                                                                    opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                        

                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                            opcion2.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                        }
                                                                                                                                                                    });
                                                                                                                                                                    opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                        

                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                            opcion3.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                        }
                                                                                                                                                                    });
                                                                                                                                                                    siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                        

                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                            onStart();
                                                                                                                                                                            opcion1.setText("10");
                                                                                                                                                                            opcion2.setText("9");
                                                                                                                                                                            opcion3.setText("8");
                                                                                                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                            primerdigito.setImageResource(R.drawable.gamenumber20);
                                                                                                                                                                            segundodigito.setImageResource(R.drawable.gamenumber12);
                                                                                                                                                                            opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                

                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                    opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                }
                                                                                                                                                                            });
                                                                                                                                                                            opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                

                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                    opcion2.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                }
                                                                                                                                                                            });
                                                                                                                                                                            opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                

                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                    opcion3.setBackgroundColor(-16711936);
                                                                                                                                                                                    opcion3.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                                                                                                    soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                                                                                                }
                                                                                                                                                                            });
                                                                                                                                                                            siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                

                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                    onStart();
                                                                                                                                                                                    opcion1.setText("8");
                                                                                                                                                                                    opcion2.setText("10");
                                                                                                                                                                                    opcion3.setText("12");
                                                                                                                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                    primerdigito.setImageResource(R.drawable.gamenumber18);
                                                                                                                                                                                    segundodigito.setImageResource(R.drawable.gamenumber8);
                                                                                                                                                                                    opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                        

                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                            opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                        }
                                                                                                                                                                                    });
                                                                                                                                                                                    opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                        

                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                            opcion2.setBackgroundColor(-16711936);
                                                                                                                                                                                            opcion2.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                                                                                                            soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                                                                                                        }
                                                                                                                                                                                    });
                                                                                                                                                                                    opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                        

                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                            opcion3.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                        }
                                                                                                                                                                                    });
                                                                                                                                                                                    siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                        

                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                            onStart();
                                                                                                                                                                                            opcion1.setText("14");
                                                                                                                                                                                            opcion2.setText("12");
                                                                                                                                                                                            opcion3.setText("15");
                                                                                                                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                            primerdigito.setImageResource(R.drawable.gamenumber24);
                                                                                                                                                                                            segundodigito.setImageResource(R.drawable.gamenumber10);
                                                                                                                                                                                            opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                

                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                    opcion1.setBackgroundColor(-16711936);
                                                                                                                                                                                                    opcion1.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                                                                                                                    soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                                                                                                                }
                                                                                                                                                                                            });
                                                                                                                                                                                            opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                

                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                    opcion2.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                }
                                                                                                                                                                                            });
                                                                                                                                                                                            opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                

                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                    opcion3.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                }
                                                                                                                                                                                            });
                                                                                                                                                                                            siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                

                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                    onStart();
                                                                                                                                                                                                    opcion1.setText("4");
                                                                                                                                                                                                    opcion2.setText("2");
                                                                                                                                                                                                    opcion3.setText("3");
                                                                                                                                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                    primerdigito.setImageResource(R.drawable.gamenumber18);
                                                                                                                                                                                                    segundodigito.setImageResource(R.drawable.gamenumber16);
                                                                                                                                                                                                    opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                        

                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                            opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    });
                                                                                                                                                                                                    opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                        

                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                            opcion2.setBackgroundColor(-16711936);
                                                                                                                                                                                                            opcion2.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                                                                                                                            soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    });
                                                                                                                                                                                                    opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                        

                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                            opcion3.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    });
                                                                                                                                                                                                    siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                        

                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                            onStart();
                                                                                                                                                                                                            opcion1.setText("12");
                                                                                                                                                                                                            opcion2.setText("16");
                                                                                                                                                                                                            opcion3.setText("14");
                                                                                                                                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                            primerdigito.setImageResource(R.drawable.gamenumber20);
                                                                                                                                                                                                            segundodigito.setImageResource(R.drawable.gamenumber4);
                                                                                                                                                                                                            opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                

                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                    opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                }
                                                                                                                                                                                                            });
                                                                                                                                                                                                            opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                

                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                    opcion2.setBackgroundColor(-16711936);
                                                                                                                                                                                                                    opcion2.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                                                                                                                                    soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                                                                                                                                }
                                                                                                                                                                                                            });
                                                                                                                                                                                                            opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                

                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                    opcion3.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                }
                                                                                                                                                                                                            });
                                                                                                                                                                                                            siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                

                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                    onStart();
                                                                                                                                                                                                                    opcion1.setText("14");
                                                                                                                                                                                                                    opcion2.setText("15");
                                                                                                                                                                                                                    opcion3.setText("13");
                                                                                                                                                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                    primerdigito.setImageResource(R.drawable.gamenumber25);
                                                                                                                                                                                                                    segundodigito.setImageResource(R.drawable.gamenumber10);
                                                                                                                                                                                                                    opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                        

                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                            opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    });
                                                                                                                                                                                                                    opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                        

                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                            opcion2.setBackgroundColor(-16711936);
                                                                                                                                                                                                                            opcion2.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                                                                                                                                            soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    });
                                                                                                                                                                                                                    opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                        

                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                            opcion3.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    });
                                                                                                                                                                                                                    siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                        

                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                            onStart();
                                                                                                                                                                                                                            opcion1.setText("9");
                                                                                                                                                                                                                            opcion2.setText("11");
                                                                                                                                                                                                                            opcion3.setText("12");
                                                                                                                                                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                            primerdigito.setImageResource(R.drawable.gamenumber18);
                                                                                                                                                                                                                            segundodigito.setImageResource(R.drawable.gamenumber7);
                                                                                                                                                                                                                            opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                

                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                    opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            });
                                                                                                                                                                                                                            opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                

                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                    opcion2.setBackgroundColor(-16711936);
                                                                                                                                                                                                                                    opcion2.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                                                                                                                                                    soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            });
                                                                                                                                                                                                                            opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                

                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                    opcion3.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            });
                                                                                                                                                                                                                            siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                

                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                    onStart();
                                                                                                                                                                                                                                    opcion1.setText("11");
                                                                                                                                                                                                                                    opcion2.setText("14");
                                                                                                                                                                                                                                    opcion3.setText("12");
                                                                                                                                                                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                    primerdigito.setImageResource(R.drawable.gamenumber24);
                                                                                                                                                                                                                                    segundodigito.setImageResource(R.drawable.gamenumber12);
                                                                                                                                                                                                                                    opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                            opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                    opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                            opcion2.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                    opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                            opcion3.setBackgroundColor(-16711936);
                                                                                                                                                                                                                                            opcion3.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                                                                                                                                                            soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                    siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                            onStart();
                                                                                                                                                                                                                                            opcion1.setText("45");
                                                                                                                                                                                                                                            opcion2.setText("44");
                                                                                                                                                                                                                                            opcion3.setText("40");
                                                                                                                                                                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                            primerdigito.setImageResource(R.drawable.gamenumber50);
                                                                                                                                                                                                                                            segundodigito.setImageResource(R.drawable.gamenumber5);
                                                                                                                                                                                                                                            opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                

                                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                                    opcion1.setBackgroundColor(-16711936);
                                                                                                                                                                                                                                                    opcion1.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                                                                                                                                                                    soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                            opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                

                                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                                    opcion2.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                            opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                

                                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                                    opcion3.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                            siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                

                                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                                    onStart();
                                                                                                                                                                                                                                                    opcion1.setText("38");
                                                                                                                                                                                                                                                    opcion2.setText("32");
                                                                                                                                                                                                                                                    opcion3.setText("34");
                                                                                                                                                                                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                    primerdigito.setImageResource(R.drawable.gamenumber36);
                                                                                                                                                                                                                                                    segundodigito.setImageResource(R.drawable.gamenumber2);
                                                                                                                                                                                                                                                    opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                                            opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                    opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                                            opcion2.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                    opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                                            opcion3.setBackgroundColor(-16711936);
                                                                                                                                                                                                                                                            opcion3.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                                                                                                                                                                            soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                    siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                                            onStart();
                                                                                                                                                                                                                                                            opcion1.setText("29");
                                                                                                                                                                                                                                                            opcion2.setText("26");
                                                                                                                                                                                                                                                            opcion3.setText("28");
                                                                                                                                                                                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                            primerdigito.setImageResource(R.drawable.gamenumber32);
                                                                                                                                                                                                                                                            segundodigito.setImageResource(R.drawable.gamenumber6);
                                                                                                                                                                                                                                                            opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                

                                                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                                                    opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                            opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                

                                                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                                                    opcion2.setBackgroundColor(-16711936);
                                                                                                                                                                                                                                                                    opcion2.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                                                                                                                                                                                    soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                            opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                

                                                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                                                    opcion3.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                            siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                

                                                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                                                    onStart();
                                                                                                                                                                                                                                                                    opcion1.setText("28");
                                                                                                                                                                                                                                                                    opcion2.setText("34");
                                                                                                                                                                                                                                                                    opcion3.setText("30");
                                                                                                                                                                                                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                    primerdigito.setImageResource(R.drawable.gamenumber48);
                                                                                                                                                                                                                                                                    segundodigito.setImageResource(R.drawable.gamenumber18);
                                                                                                                                                                                                                                                                    opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                                                            opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                    opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                                                            opcion2.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                    opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                                                            opcion3.setBackgroundColor(-16711936);
                                                                                                                                                                                                                                                                            opcion3.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                                                                                                                                                                                            soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                    siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                                                            onStart();
                                                                                                                                                                                                                                                                            opcion1.setText("32");
                                                                                                                                                                                                                                                                            opcion2.setText("30");
                                                                                                                                                                                                                                                                            opcion3.setText("31");
                                                                                                                                                                                                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                            primerdigito.setImageResource(R.drawable.gamenumber56);
                                                                                                                                                                                                                                                                            segundodigito.setImageResource(R.drawable.gamenumber25);
                                                                                                                                                                                                                                                                            opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                

                                                                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                                                                    opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                            opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                

                                                                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                                                                    opcion2.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                            opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                

                                                                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                                                                    opcion3.setBackgroundColor(-16711936);
                                                                                                                                                                                                                                                                                    opcion3.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                                                                                                                                                                                                    soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                            siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                

                                                                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                                                                    onStart();
                                                                                                                                                                                                                                                                                    opcion1.setText("20");
                                                                                                                                                                                                                                                                                    opcion2.setText("18");
                                                                                                                                                                                                                                                                                    opcion3.setText("22");
                                                                                                                                                                                                                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                    primerdigito.setImageResource(R.drawable.gamenumber50);
                                                                                                                                                                                                                                                                                    segundodigito.setImageResource(R.drawable.gamenumber32);
                                                                                                                                                                                                                                                                                    opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                                                                            opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                                    opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                                                                            opcion2.setBackgroundColor(-16711936);
                                                                                                                                                                                                                                                                                            opcion2.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                                                                                                                                                                                                            soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                                    opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                                                                            opcion3.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                                    siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                                                                            onStart();
                                                                                                                                                                                                                                                                                            opcion1.setText("39");
                                                                                                                                                                                                                                                                                            opcion2.setText("37");
                                                                                                                                                                                                                                                                                            opcion3.setText("41");
                                                                                                                                                                                                                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                            primerdigito.setImageResource(R.drawable.gamenumber56);
                                                                                                                                                                                                                                                                                            segundodigito.setImageResource(R.drawable.gamenumber15);
                                                                                                                                                                                                                                                                                            opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                

                                                                                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                                                                                    opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                            opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                

                                                                                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                                                                                    opcion2.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                            opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                

                                                                                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                                                                                    opcion3.setBackgroundColor(-16711936);
                                                                                                                                                                                                                                                                                                    opcion3.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                                                                                                                                                                                                                    soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                            siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                

                                                                                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                                                                                    onStart();
                                                                                                                                                                                                                                                                                                    opcion1.setText("28");
                                                                                                                                                                                                                                                                                                    opcion2.setText("30");
                                                                                                                                                                                                                                                                                                    opcion3.setText("29");
                                                                                                                                                                                                                                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                    primerdigito.setImageResource(R.drawable.gamenumber60);
                                                                                                                                                                                                                                                                                                    segundodigito.setImageResource(R.drawable.gamenumber32);
                                                                                                                                                                                                                                                                                                    opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                                                                                            opcion1.setBackgroundColor(-16711936);
                                                                                                                                                                                                                                                                                                            opcion1.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                                                                                                                                                                                                                            soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                                                    opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                                                                                            opcion2.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                                                    opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                                                                                            opcion3.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                                                    siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                                                                                            onStart();
                                                                                                                                                                                                                                                                                                            opcion1.setText("16");
                                                                                                                                                                                                                                                                                                            opcion2.setText("14");
                                                                                                                                                                                                                                                                                                            opcion3.setText("18");
                                                                                                                                                                                                                                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                            primerdigito.setImageResource(R.drawable.gamenumber48);
                                                                                                                                                                                                                                                                                                            segundodigito.setImageResource(R.drawable.gamenumber32);
                                                                                                                                                                                                                                                                                                            opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                

                                                                                                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                                                                                                    opcion1.setBackgroundColor(-16711936);
                                                                                                                                                                                                                                                                                                                    opcion1.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                                                                                                                                                                                                                                    soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                                            opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                

                                                                                                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                                                                                                    opcion2.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                                            opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                

                                                                                                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                                                                                                    opcion3.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                                            siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                

                                                                                                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                                                                                                    onStart();
                                                                                                                                                                                                                                                                                                                    opcion1.setText("65");
                                                                                                                                                                                                                                                                                                                    opcion2.setText("45");
                                                                                                                                                                                                                                                                                                                    opcion3.setText("55");
                                                                                                                                                                                                                                                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                                    primerdigito.setImageResource(R.drawable.gamenumber80);
                                                                                                                                                                                                                                                                                                                    segundodigito.setImageResource(R.drawable.gamenumber25);
                                                                                                                                                                                                                                                                                                                    opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                                                                                                            opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                                                                    opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                                                                                                            opcion2.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                                                                    opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                                                                                                            opcion3.setBackgroundColor(-16711936);
                                                                                                                                                                                                                                                                                                                            opcion3.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                                                                                                                                                                                                                                            soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                                                                    siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                                                                                                            onStart();
                                                                                                                                                                                                                                                                                                                            opcion1.setText("22");
                                                                                                                                                                                                                                                                                                                            opcion2.setText("26");
                                                                                                                                                                                                                                                                                                                            opcion3.setText("20");
                                                                                                                                                                                                                                                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                                            primerdigito.setImageResource(R.drawable.gamenumber56);
                                                                                                                                                                                                                                                                                                                            segundodigito.setImageResource(R.drawable.gamenumber36);
                                                                                                                                                                                                                                                                                                                            opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                                

                                                                                                                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                                                                                                                    opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                                                            opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                                

                                                                                                                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                                                                                                                    opcion2.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                                                            opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                                

                                                                                                                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                                                                                                                    opcion3.setBackgroundColor(-16711936);
                                                                                                                                                                                                                                                                                                                                    opcion3.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                                                                                                                                                                                                                                                    soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                                                            siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                                

                                                                                                                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                                                                                                                    onStart();
                                                                                                                                                                                                                                                                                                                                    opcion1.setText("44");
                                                                                                                                                                                                                                                                                                                                    opcion2.setText("48");
                                                                                                                                                                                                                                                                                                                                    opcion3.setText("42");
                                                                                                                                                                                                                                                                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                                                    primerdigito.setImageResource(R.drawable.gamenumber80);
                                                                                                                                                                                                                                                                                                                                    segundodigito.setImageResource(R.drawable.gamenumber32);
                                                                                                                                                                                                                                                                                                                                    opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                                                                                                                            opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                                                                                    opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                                                                                                                            opcion2.setBackgroundColor(-16711936);
                                                                                                                                                                                                                                                                                                                                            opcion2.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                                                                                                                                                                                                                                                            soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                                                                                    opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                                                                                                                            opcion3.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                                                                                    siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                                                                                                                            onStart();
                                                                                                                                                                                                                                                                                                                                            opcion1.setText("15");
                                                                                                                                                                                                                                                                                                                                            opcion2.setText("12");
                                                                                                                                                                                                                                                                                                                                            opcion3.setText("13");
                                                                                                                                                                                                                                                                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                                                            primerdigito.setImageResource(R.drawable.gamenumber60);
                                                                                                                                                                                                                                                                                                                                            segundodigito.setImageResource(R.drawable.gamenumber48);
                                                                                                                                                                                                                                                                                                                                            opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                                                

                                                                                                                                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                                                                                                                                    opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                                                                            opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                                                

                                                                                                                                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                                                                                                                                    opcion2.setBackgroundColor(-16711936);
                                                                                                                                                                                                                                                                                                                                                    opcion2.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                                                                                                                                                                                                                                                                    soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                                                                            opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                                                

                                                                                                                                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                                                                                                                                    opcion3.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                                                                            siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                                                

                                                                                                                                                                                                                                                                                                                                                public void onClick(View view) {
                                                                                                                                                                                                                                                                                                                                                    onStart();
                                                                                                                                                                                                                                                                                                                                                    opcion1.setText("29");
                                                                                                                                                                                                                                                                                                                                                    opcion2.setText("33");
                                                                                                                                                                                                                                                                                                                                                    opcion3.setText("32");
                                                                                                                                                                                                                                                                                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                                                                    primerdigito.setImageResource(R.drawable.gamenumber50);
                                                                                                                                                                                                                                                                                                                                                    segundodigito.setImageResource(R.drawable.gamenumber18);
                                                                                                                                                                                                                                                                                                                                                    opcion1.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                                                                                                                                            opcion1.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                                                                                                    opcion2.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                                                                                                                                            opcion2.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                                                                                                    opcion3.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                                                                                                                                            opcion3.setBackgroundColor(-16711936);
                                                                                                                                                                                                                                                                                                                                                            opcion3.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.goodgame));
                                                                                                                                                                                                                                                                                                                                                            soundPool.play(soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                                                                                                    siguiente.setOnClickListener(new View.OnClickListener() {
                                                                                                                                                                                                                                                                                                                                                        

                                                                                                                                                                                                                                                                                                                                                        public void onClick(View view) {
                                                                                                                                                                                                                                                                                                                                                            startActivity(new Intent(getApplicationContext(), layoutend.class));
                                                                                                                                                                                                                                                                                                                                                            finish();
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            });
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    });
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            });
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    });
                                                                                                                                                                                                                }
                                                                                                                                                                                                            });
                                                                                                                                                                                                        }
                                                                                                                                                                                                    });
                                                                                                                                                                                                }
                                                                                                                                                                                            });
                                                                                                                                                                                        }
                                                                                                                                                                                    });
                                                                                                                                                                                }
                                                                                                                                                                            });
                                                                                                                                                                        }
                                                                                                                                                                    });
                                                                                                                                                                }
                                                                                                                                                            });
                                                                                                                                                        }
                                                                                                                                                    });
                                                                                                                                                }
                                                                                                                                            });
                                                                                                                                        }
                                                                                                                                    });
                                                                                                                                }
                                                                                                                            });
                                                                                                                        }
                                                                                                                    });
                                                                                                                }
                                                                                                            });
                                                                                                        }
                                                                                                    });
                                                                                                }
                                                                                            });
                                                                                        }
                                                                                    });
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                        }
                                                    });
                                                }
                                            });
                                        }
                                    });
                                }
                            });
                        }
                    });
                }
            });
        }
    }
}
