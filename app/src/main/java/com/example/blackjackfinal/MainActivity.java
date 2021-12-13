package com.example.blackjackfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button playBTN;
    private Button standBTN;
    private Button hitBTN;
    private Game newGame;
    private ImageView Card1a;
    private ImageView Card1b;
    private ImageView Card1c;
    private ImageView Card1d;
    private ImageView Card1e;
    private ImageView Card2a;
    private ImageView Card2b;
    private ImageView Card2c;
    private ImageView Card2d;
    private ImageView Card2e;
    private TextView theTextView;
    private Deck deck = new Deck();
    private User user = new User();
    private Dealer dealer = new Dealer();
    private Hands dealerHand;
    private Hands userHand;
    private ImageView setter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Makes play button respond to a click and if the balance is 0 then it says insufficient funds
        playBTN = findViewById(R.id.playbtn);
        standBTN = findViewById(R.id.standbtn);
        hitBTN = findViewById(R.id.hitbtn);
        Card1a = findViewById(R.id.cardback1a);


        Card1b = findViewById(R.id.cardback1b);
        Card2a = findViewById(R.id.cardback2a);
        Card2b = findViewById(R.id.cardback2b);

        Card1c = findViewById(R.id.cardback1c);
        Card1d = findViewById(R.id.cardback1d);
        Card1e = findViewById(R.id.cardback1e);
        Card2a = findViewById(R.id.cardback2a);
        Card2b = findViewById(R.id.cardback2b);
        Card2c = findViewById(R.id.cardback2c);
        Card2d = findViewById(R.id.cardback2d);
        Card2e = findViewById(R.id.cardback2e);

        playBTN.setOnClickListener(view -> {
            /*makes "playBTN" invisible*/
            playBTN.setVisibility(View.GONE);
            standBTN.setVisibility(View.VISIBLE);
            hitBTN.setVisibility(View.VISIBLE);
            Card1a.setVisibility(View.VISIBLE);
            Card1b.setVisibility(View.VISIBLE);
            Card2a.setVisibility(View.VISIBLE);
            Card2b.setVisibility(View.VISIBLE);

            //Card1b.setImageResource(R.drawable.aceclub);
            //Card2a.setImageResource(R.drawable.jackclub);
            //Card2b.setImageResource(R.drawable.twoclub);

            /*plays the game*/
            //newGame = new Game();
            //newGame.blackJack();
            int val;
            char suit;
            deck.shuffle();
            dealerHand = new Hands();
            dealerHand.hit(deck.nextCard());
            dealerHand.hit(deck.nextCard());
            display(dealerHand.find(1),Card1b);
            userHand = new Hands();
            userHand.hit(deck.nextCard());
            display(userHand.find(0),Card2a);
            userHand.hit(deck.nextCard());
            display(userHand.find(1),Card2b);
            showTotal(userHand);

        });

        hitBTN.setOnClickListener(view->{
            if(userHand.getSize()==2 && userHand.total()!=21){
                userHand.hit(deck.nextCard());
                Card2c.setVisibility(View.VISIBLE);
                display(userHand.find(2),Card2c);
                showTotal(userHand);
                if(userHand.total()>21){
                    /*loss*/
                }
            } else if(userHand.getSize()==3 && userHand.total()!=21){
                userHand.hit(deck.nextCard());
                Card2d.setVisibility(View.VISIBLE);
                display(userHand.find(3),Card2d);
                showTotal(userHand);
                if(userHand.total()>21){
                    /*loss*/
                }
            } else if(userHand.getSize()==4 && userHand.total()!=21){
                userHand.hit(deck.nextCard());
                Card2e.setVisibility(View.VISIBLE);
                display(userHand.find(4),Card2e);
                showTotal(userHand);
                if(userHand.total()>21){
                    /*loss*/
                }
            }
        });


    }

    public void showTotal(Hands hand){
        String message = ("total: "+hand.total());
        theTextView = findViewById(R.id.textView1);
        theTextView.setText(message);
    }


    public void display(Card card, ImageView Card1b){
        int val = card.getVal();
        char suit = card.getSuit();
        switch(val){
            case 1: switch (suit){
                case 's':
                    Card1b.setImageResource(R.drawable.acespade);
                    break;
                case 'c':
                    Card1b.setImageResource(R.drawable.aceclub);
                    break;
                case 'd':
                    Card1b.setImageResource(R.drawable.acediamond);
                    break;
                case 'h':
                    Card1b.setImageResource(R.drawable.aceheart);
                    break;
                default:
            }
                break;
            case 2: switch (suit){
                case 's':
                    Card1b.setImageResource(R.drawable.twospade);
                    break;
                case 'c':
                    Card1b.setImageResource(R.drawable.twoclub);
                    break;
                case 'd':
                    Card1b.setImageResource(R.drawable.twodiamond);
                    break;
                case 'h':
                    Card1b.setImageResource(R.drawable.twoheart);
                    break;
                default:
            }
                break;
            case 3: switch (suit){
                case 's':
                    Card1b.setImageResource(R.drawable.threespade);
                    break;
                case 'c':
                    Card1b.setImageResource(R.drawable.threeclub);
                    break;
                case 'd':
                    Card1b.setImageResource(R.drawable.threediamond);
                    break;
                case 'h':
                    Card1b.setImageResource(R.drawable.threeheart);
                    break;
                default:
            }
                break;
            case 4: switch (suit){
                case 's':
                    Card1b.setImageResource(R.drawable.fourspade);
                    break;
                case 'c':
                    Card1b.setImageResource(R.drawable.fourclub);
                    break;
                case 'd':
                    Card1b.setImageResource(R.drawable.fourdiamond);
                    break;
                case 'h':
                    Card1b.setImageResource(R.drawable.fourheart);
                    break;
                default:
            }
                break;
            case 5: switch (suit){
                case 's':
                    Card1b.setImageResource(R.drawable.fivespade);
                    break;
                case 'c':
                    Card1b.setImageResource(R.drawable.fiveclub);
                    break;
                case 'd':
                    Card1b.setImageResource(R.drawable.fivediamond);
                    break;
                case 'h':
                    Card1b.setImageResource(R.drawable.fiveheart);
                    break;
                default:
            }
                break;
            case 6: switch (suit){
                case 's':
                    Card1b.setImageResource(R.drawable.sixspade);
                    break;
                case 'c':
                    Card1b.setImageResource(R.drawable.sixclub);
                    break;
                case 'd':
                    Card1b.setImageResource(R.drawable.sixdiamond);
                    break;
                case 'h':
                    Card1b.setImageResource(R.drawable.sixheart);
                    break;
                default:
            }
                break;
            case 7: switch (suit){
                case 's':
                    Card1b.setImageResource(R.drawable.sevenspade);
                    break;
                case 'c':
                    Card1b.setImageResource(R.drawable.sevenclub);
                    break;
                case 'd':
                    Card1b.setImageResource(R.drawable.sevendiamond);
                    break;
                case 'h':
                    Card1b.setImageResource(R.drawable.sevenheart);
                    break;
                default:
            }
                break;
            case 8: switch (suit){
                case 's':
                    Card1b.setImageResource(R.drawable.eightspade);
                    break;
                case 'c':
                    Card1b.setImageResource(R.drawable.eightclub);
                    break;
                case 'd':
                    Card1b.setImageResource(R.drawable.eightdiamond);
                    break;
                case 'h':
                    Card1b.setImageResource(R.drawable.eightheart);
                    break;
                default:
            }
                break;
            case 9: switch (suit){
                case 's':
                    Card1b.setImageResource(R.drawable.ninespade);
                    break;
                case 'c':
                    Card1b.setImageResource(R.drawable.nineclub);
                    break;
                case 'd':
                    Card1b.setImageResource(R.drawable.ninediamond);
                    break;
                case 'h':
                    Card1b.setImageResource(R.drawable.nineheart);
                    break;
                default:
            }
                break;
            case 10: switch(suit){
                case 's':
                    Card1b.setImageResource(R.drawable.tenspade);
                    break;
                case 'c':
                    Card1b.setImageResource(R.drawable.tenclub);
                    break;
                case 'd':
                    Card1b.setImageResource(R.drawable.tendiamond);
                    break;
                case 'h':
                    Card1b.setImageResource(R.drawable.tenheart);
                    break;
                default:
            }
                break;
            case 11: switch (suit){
                case 's':
                    Card1b.setImageResource(R.drawable.jackspade);
                    break;
                case 'c':
                    Card1b.setImageResource(R.drawable.jackclub);
                    break;
                case 'd':
                    Card1b.setImageResource(R.drawable.jackdiamond);
                    break;
                case 'h':
                    Card1b.setImageResource(R.drawable.jackheart);
                    break;
                default:
            }
                break;
            case 12: switch (suit){
                case 's':
                    Card1b.setImageResource(R.drawable.queenspade);
                    break;
                case 'c':
                    Card1b.setImageResource(R.drawable.queenclub);
                    break;
                case 'd':
                    Card1b.setImageResource(R.drawable.queendiamond);
                    break;
                case 'h':
                    Card1b.setImageResource(R.drawable.queenheart);
                    break;
                default:
            }
                break;
            case 13: switch (suit){
                case 's':
                    Card1b.setImageResource(R.drawable.kingspade);
                    break;
                case 'c':
                    Card1b.setImageResource(R.drawable.kingclub);
                    break;
                case 'd':
                    Card1b.setImageResource(R.drawable.kingdiamond);
                    break;
                case 'h':
                    Card1b.setImageResource(R.drawable.kingheart);
                    break;
                default:
            }
                break;
            default:

        }
    }
}
