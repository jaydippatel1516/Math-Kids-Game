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



public class layoutmultiplication extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {
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
        setContentView(R.layout.layoutmultiplication);
       
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
            } else if (id==R.id.opcion2) {
                this.opcion2.setBackgroundColor(-16711936);
                this.opcion2.startAnimation(AnimationUtils.loadAnimation(this, R.anim.goodgame));
                this.soundPool.play(this.soundCorrect, 1.0f, 1.0f, 1, 0, 1.0f);
            } else if (id==R.id.opcion3) {
                this.opcion3.setBackgroundColor(SupportMenu.CATEGORY_MASK);
                
            }
            
        } else {
            onStart();
            this.opcion1.setText("5");
            this.opcion2.setText("6");
            this.opcion3.setText("7");
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
                    opcion1.setText("12");
                    opcion2.setText("8");
                    opcion3.setText("16");
                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                    primerdigito.setImageResource(R.drawable.gamenumber2);
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
                            opcion1.setText("3");
                            opcion2.setText("7");
                            opcion3.setText("4");
                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                            primerdigito.setImageResource(R.drawable.gamenumber1);
                            segundodigito.setImageResource(R.drawable.gamenumber4);
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
                                    opcion3.setText("7");
                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                    primerdigito.setImageResource(R.drawable.gamenumber5);
                                    segundodigito.setImageResource(R.drawable.gamenumber2);
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
                                            opcion1.setText("1");
                                            opcion2.setText("2");
                                            opcion3.setText("3");
                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                            primerdigito.setImageResource(R.drawable.gamenumber1);
                                            segundodigito.setImageResource(R.drawable.gamenumber1);
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
                                                    opcion2.setText("5");
                                                    opcion3.setText("6");
                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                    primerdigito.setImageResource(R.drawable.gamenumber5);
                                                    segundodigito.setImageResource(R.drawable.gamenumber1);
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
                                                            opcion1.setText("7");
                                                            opcion2.setText("6");
                                                            opcion3.setText("9");
                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                            primerdigito.setImageResource(R.drawable.gamenumber3);
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
                                                                    opcion1.setText("8");
                                                                    opcion2.setText("6");
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
                                                                            opcion2.setText("5");
                                                                            opcion3.setText("3");
                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                            primerdigito.setImageResource(R.drawable.gamenumber4);
                                                                            segundodigito.setImageResource(R.drawable.gamenumber1);
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
                                                                                    opcion1.setText("9");
                                                                                    opcion2.setText("7");
                                                                                    opcion3.setText("8");
                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                    primerdigito.setImageResource(R.drawable.gamenumber2);
                                                                                    segundodigito.setImageResource(R.drawable.gamenumber4);
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
                                                                                            opcion1.setText("12");
                                                                                            opcion2.setText("10");
                                                                                            opcion3.setText("14");
                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                            primerdigito.setImageResource(R.drawable.gamenumber3);
                                                                                            segundodigito.setImageResource(R.drawable.gamenumber4);
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
                                                                                                    opcion2.setText("6");
                                                                                                    opcion3.setText("4");
                                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                    primerdigito.setImageResource(R.drawable.gamenumber2);
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
                                                                                                            opcion1.setText("3");
                                                                                                            opcion2.setText("5");
                                                                                                            opcion3.setText("4");
                                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                            primerdigito.setImageResource(R.drawable.gamenumber1);
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
                                                                                                                    opcion2.setText("6");
                                                                                                                    opcion3.setText("4");
                                                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                    primerdigito.setImageResource(R.drawable.gamenumber2);
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
                                                                                                                            opcion1.setText("28");
                                                                                                                            opcion2.setText("24");
                                                                                                                            opcion3.setText("27");
                                                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                            primerdigito.setImageResource(R.drawable.gamenumber7);
                                                                                                                            segundodigito.setImageResource(R.drawable.gamenumber4);
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
                                                                                                                                    opcion1.setText("34");
                                                                                                                                    opcion2.setText("24");
                                                                                                                                    opcion3.setText("26");
                                                                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                    primerdigito.setImageResource(R.drawable.gamenumber4);
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
                                                                                                                                            opcion1.setText("48");
                                                                                                                                            opcion2.setText("54");
                                                                                                                                            opcion3.setText("49");
                                                                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                            primerdigito.setImageResource(R.drawable.gamenumber7);
                                                                                                                                            segundodigito.setImageResource(R.drawable.gamenumber7);
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
                                                                                                                                                    opcion1.setText("46");
                                                                                                                                                    opcion2.setText("48");
                                                                                                                                                    opcion3.setText("56");
                                                                                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                    primerdigito.setImageResource(R.drawable.gamenumber6);
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
                                                                                                                                                            opcion1.setText("45");
                                                                                                                                                            opcion2.setText("30");
                                                                                                                                                            opcion3.setText("35");
                                                                                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                            primerdigito.setImageResource(R.drawable.gamenumber7);
                                                                                                                                                            segundodigito.setImageResource(R.drawable.gamenumber5);
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
                                                                                                                                                                    opcion1.setText("27");
                                                                                                                                                                    opcion2.setText("24");
                                                                                                                                                                    opcion3.setText("28");
                                                                                                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                    primerdigito.setImageResource(R.drawable.gamenumber3);
                                                                                                                                                                    segundodigito.setImageResource(R.drawable.gamenumber9);
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
                                                                                                                                                                            opcion1.setText("25");
                                                                                                                                                                            opcion2.setText("28");
                                                                                                                                                                            opcion3.setText("32");
                                                                                                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                            primerdigito.setImageResource(R.drawable.gamenumber4);
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
                                                                                                                                                                                    opcion1.setText("28");
                                                                                                                                                                                    opcion2.setText("21");
                                                                                                                                                                                    opcion3.setText("24");
                                                                                                                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                    primerdigito.setImageResource(R.drawable.gamenumber3);
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
                                                                                                                                                                                            opcion1.setText("36");
                                                                                                                                                                                            opcion2.setText("40");
                                                                                                                                                                                            opcion3.setText("35");
                                                                                                                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                            primerdigito.setImageResource(R.drawable.gamenumber4);
                                                                                                                                                                                            segundodigito.setImageResource(R.drawable.gamenumber9);
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
                                                                                                                                                                                                    opcion1.setText("30");
                                                                                                                                                                                                    opcion2.setText("25");
                                                                                                                                                                                                    opcion3.setText("20");
                                                                                                                                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                    primerdigito.setImageResource(R.drawable.gamenumber5);
                                                                                                                                                                                                    segundodigito.setImageResource(R.drawable.gamenumber5);
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
                                                                                                                                                                                                            opcion1.setText("32");
                                                                                                                                                                                                            opcion2.setText("24");
                                                                                                                                                                                                            opcion3.setText("28");
                                                                                                                                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                            primerdigito.setImageResource(R.drawable.gamenumber3);
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
                                                                                                                                                                                                                    opcion1.setText("42");
                                                                                                                                                                                                                    opcion2.setText("40");
                                                                                                                                                                                                                    opcion3.setText("48");
                                                                                                                                                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                    primerdigito.setImageResource(R.drawable.gamenumber8);
                                                                                                                                                                                                                    segundodigito.setImageResource(R.drawable.gamenumber5);
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
                                                                                                                                                                                                                            opcion1.setText("18");
                                                                                                                                                                                                                            opcion2.setText("20");
                                                                                                                                                                                                                            opcion3.setText("22");
                                                                                                                                                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                            primerdigito.setImageResource(R.drawable.gamenumber4);
                                                                                                                                                                                                                            segundodigito.setImageResource(R.drawable.gamenumber5);
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
                                                                                                                                                                                                                                    opcion1.setText("35");
                                                                                                                                                                                                                                    opcion2.setText("49");
                                                                                                                                                                                                                                    opcion3.setText("42");
                                                                                                                                                                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                    primerdigito.setImageResource(R.drawable.gamenumber7);
                                                                                                                                                                                                                                    segundodigito.setImageResource(R.drawable.gamenumber6);
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
                                                                                                                                                                                                                                            opcion1.setText("56");
                                                                                                                                                                                                                                            opcion2.setText("64");
                                                                                                                                                                                                                                            opcion3.setText("48");
                                                                                                                                                                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                            primerdigito.setImageResource(R.drawable.gamenumber7);
                                                                                                                                                                                                                                            segundodigito.setImageResource(R.drawable.gamenumber8);
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
                                                                                                                                                                                                                                                    opcion1.setText("48");
                                                                                                                                                                                                                                                    opcion2.setText("45");
                                                                                                                                                                                                                                                    opcion3.setText("54");
                                                                                                                                                                                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                    primerdigito.setImageResource(R.drawable.gamenumber6);
                                                                                                                                                                                                                                                    segundodigito.setImageResource(R.drawable.gamenumber9);
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
                                                                                                                                                                                                                                                            opcion1.setText("46");
                                                                                                                                                                                                                                                            opcion2.setText("42");
                                                                                                                                                                                                                                                            opcion3.setText("40");
                                                                                                                                                                                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                            primerdigito.setImageResource(R.drawable.gamenumber6);
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
                                                                                                                                                                                                                                                                    opcion1.setText("76");
                                                                                                                                                                                                                                                                    opcion2.setText("72");
                                                                                                                                                                                                                                                                    opcion3.setText("81");
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
                                                                                                                                                                                                                                                                            opcion1.setText("56");
                                                                                                                                                                                                                                                                            opcion2.setText("42");
                                                                                                                                                                                                                                                                            opcion3.setText("48");
                                                                                                                                                                                                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                            primerdigito.setImageResource(R.drawable.gamenumber8);
                                                                                                                                                                                                                                                                            segundodigito.setImageResource(R.drawable.gamenumber6);
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
                                                                                                                                                                                                                                                                                    opcion1.setText("81");
                                                                                                                                                                                                                                                                                    opcion2.setText("90");
                                                                                                                                                                                                                                                                                    opcion3.setText("84");
                                                                                                                                                                                                                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                    primerdigito.setImageResource(R.drawable.gamenumber10);
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
                                                                                                                                                                                                                                                                                            opcion1.setText("32");
                                                                                                                                                                                                                                                                                            opcion2.setText("40");
                                                                                                                                                                                                                                                                                            opcion3.setText("36");
                                                                                                                                                                                                                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                            primerdigito.setImageResource(R.drawable.gamenumber9);
                                                                                                                                                                                                                                                                                            segundodigito.setImageResource(R.drawable.gamenumber4);
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
                                                                                                                                                                                                                                                                                                    opcion1.setText("64");
                                                                                                                                                                                                                                                                                                    opcion2.setText("48");
                                                                                                                                                                                                                                                                                                    opcion3.setText("56");
                                                                                                                                                                                                                                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                    primerdigito.setImageResource(R.drawable.gamenumber8);
                                                                                                                                                                                                                                                                                                    segundodigito.setImageResource(R.drawable.gamenumber8);
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
                                                                                                                                                                                                                                                                                                            opcion1.setText("56");
                                                                                                                                                                                                                                                                                                            opcion2.setText("68");
                                                                                                                                                                                                                                                                                                            opcion3.setText("48");
                                                                                                                                                                                                                                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                            primerdigito.setImageResource(R.drawable.gamenumber8);
                                                                                                                                                                                                                                                                                                            segundodigito.setImageResource(R.drawable.gamenumber7);
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
                                                                                                                                                                                                                                                                                                                    opcion1.setText("40");
                                                                                                                                                                                                                                                                                                                    opcion2.setText("35");
                                                                                                                                                                                                                                                                                                                    opcion3.setText("45");
                                                                                                                                                                                                                                                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                                    primerdigito.setImageResource(R.drawable.gamenumber5);
                                                                                                                                                                                                                                                                                                                    segundodigito.setImageResource(R.drawable.gamenumber9);
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
                                                                                                                                                                                                                                                                                                                            opcion2.setText("42");
                                                                                                                                                                                                                                                                                                                            opcion3.setText("49");
                                                                                                                                                                                                                                                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                                            primerdigito.setImageResource(R.drawable.gamenumber7);
                                                                                                                                                                                                                                                                                                                            segundodigito.setImageResource(R.drawable.gamenumber7);
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
                                                                                                                                                                                                                                                                                                                                    opcion1.setText("76");
                                                                                                                                                                                                                                                                                                                                    opcion2.setText("80");
                                                                                                                                                                                                                                                                                                                                    opcion3.setText("72");
                                                                                                                                                                                                                                                                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                                                    primerdigito.setImageResource(R.drawable.gamenumber8);
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
                                                                                                                                                                                                                                                                                                                                            opcion1.setText("56");
                                                                                                                                                                                                                                                                                                                                            opcion2.setText("63");
                                                                                                                                                                                                                                                                                                                                            opcion3.setText("72");
                                                                                                                                                                                                                                                                                                                                            opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                                                            opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                                                            opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                                                            primerdigito.setImageResource(R.drawable.gamenumber7);
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
                                                                                                                                                                                                                                                                                                                                                    opcion1.setText("32");
                                                                                                                                                                                                                                                                                                                                                    opcion2.setText("42");
                                                                                                                                                                                                                                                                                                                                                    opcion3.setText("36");
                                                                                                                                                                                                                                                                                                                                                    opcion1.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                                                                    opcion2.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                                                                    opcion3.setBackgroundColor(Color.parseColor("#3480B6"));
                                                                                                                                                                                                                                                                                                                                                    primerdigito.setImageResource(R.drawable.gamenumber6);
                                                                                                                                                                                                                                                                                                                                                    segundodigito.setImageResource(R.drawable.gamenumber6);
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
