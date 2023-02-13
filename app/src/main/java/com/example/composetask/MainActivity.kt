package com.example.composetask

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetask.ui.theme.ComposeTaskTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Image(
                modifier = Modifier.fillMaxWidth(),
                painter =  painterResource(R.drawable.rectangle_17),
                contentDescription = null
            )
            Box(modifier = Modifier.fillMaxSize()) {
                Image(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(20.dp),
                    painter =  painterResource(R.drawable.back),
                    contentDescription = null
                )
                Image(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(20.dp),
                    painter =  painterResource(R.drawable.group_1),
                    contentDescription = null
                )
                Card(modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter)
                    .height(375.dp),
                shape = RoundedCornerShape(46.dp,46.dp,0.dp,0.dp)
                ) {
                    Card(modifier = Modifier
                        .fillMaxSize()
                        .padding(30.dp)
                        .background(color = Color(0xFFFFFFFF)),) {
                        Column {
                            Text(text = "Borsch"
                                , color = Color(0xFF406A52),
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Row(modifier = Modifier.padding(0.dp,10.dp,0.dp,0.dp)) {
                                Column() {
                                    Image(
                                        modifier = Modifier
                                            .width(19.dp)
                                            .height(18.dp),
                                        painter =  painterResource(R.drawable.vector),
                                        contentDescription = null
                                    )
                                }
                                Column() {
                                    Image(
                                        modifier = Modifier
                                            .width(19.dp)
                                            .height(18.dp),
                                        painter =  painterResource(R.drawable.vector),
                                        contentDescription = null
                                    )
                                }
                                Column() {
                                    Image(
                                        modifier = Modifier
                                            .width(19.dp)
                                            .height(18.dp),
                                        painter =  painterResource(R.drawable.vector),
                                        contentDescription = null
                                    )
                                }
                                Column() {
                                    Image(
                                        modifier = Modifier
                                            .width(19.dp)
                                            .height(18.dp),
                                        painter =  painterResource(R.drawable.vector),
                                        contentDescription = null
                                    )
                                }
                                Column() {
                                    Image(
                                        modifier = Modifier
                                            .width(19.dp)
                                            .height(18.dp),
                                        painter =  painterResource(R.drawable.vector__1_),
                                        contentDescription = null
                                    )
                                }


                            }
                            Row(modifier = Modifier.padding(0.dp,10.dp,0.dp,0.dp)) {
                                Text(
                                    text = "€11,99",
                                    fontSize = 16.sp,
                                    color = Color(0xFF406A52),
                                    fontWeight = FontWeight.Bold,
                                )
                            }

                            Row(modifier = Modifier.padding(0.dp,10.dp,0.dp,0.dp)) {
                                Text(
                                    text = "About",
                                    fontSize = 16.sp,
                                    color = Color(0xFF999999),
                                    fontWeight = FontWeight.Bold,
                                )
                            }

                            Row(modifier = Modifier.padding(0.dp,10.dp,20.dp,10.dp), horizontalArrangement = Arrangement.Start,
                            ) {
                              Column() {
                                  Card(modifier = Modifier
                                      .fillMaxWidth(),
                                      shape = RoundedCornerShape(30.dp,30.dp,30.dp,30.dp), backgroundColor = Color(0xFFECECEC),

                                      ) {
                                      Text(
                                          text = "Hot dressing soup based on beetroot, which gives the characteristic red color.",
                                          modifier = Modifier.padding(20.dp),
                                          fontSize = 10.sp,
                                          color = Color(0xFF406A52),
                                      )
                                  }
                              }

                            }

                            Row(modifier = Modifier.padding(0.dp,10.dp,0.dp,0.dp),
                                ) {
                                Column() {
                                    Image(
                                        modifier = Modifier
                                            .width(33.dp)
                                            .height(23.dp),
                                        painter =  painterResource(R.drawable.group),
                                        contentDescription = null
                                    )
                                }
                               Spacer(modifier = Modifier.size(10.dp,10.dp))
                                Column() {
                                    Text(
                                        text = "300g",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 16.sp,
                                        color = Color(0xFF406A52),
                                    )
                                }
                                Spacer(modifier = Modifier.size(10.dp,10.dp))

                                Column() {
                                    Image(
                                        modifier = Modifier
                                            .width(33.dp)
                                            .height(23.dp),
                                        painter =  painterResource(R.drawable.delivery),
                                        contentDescription = null
                                    )
                                }
                                Spacer(modifier = Modifier.size(10.dp,10.dp))

                                Column() {
                                    Text(
                                        text = "30-45min",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 16.sp,
                                        color = Color(0xFF406A52),
                                    )
                                }

                                }
                            Spacer(modifier = Modifier
                                .fillMaxWidth()
                                .height(30.dp))
                            Row() {
                                Column() {
                                    Card(
                                        shape = RoundedCornerShape(30.dp, 30.dp, 30.dp, 30.dp),
                                        backgroundColor = Color(0xFFECECEC),
                                    ) {
                                        Image(
                                            modifier = Modifier
                                                .width(51.dp)
                                                .height(51.dp)
                                                .padding(10.dp),
                                            painter = painterResource(R.drawable.vector__4_),
                                            contentDescription = null
                                        )
                                    }
                                }
                                Spacer(modifier = Modifier.size(5.dp, 5.dp))

                                Column(modifier = Modifier.fillMaxWidth()) {

                                    Button(modifier = Modifier.fillMaxWidth(),onClick = {
                                        //your onclick code here
                                    },shape = RoundedCornerShape(20.dp,20.dp,20.dp,20.dp),colors = ButtonDefaults.buttonColors(backgroundColor =Color(0xFF406A52))) {
                                        Text(text = "Buy Now",color = Color(0xFFFFFFFF),)

                                    }

                                }
                            }

                        }


                    }
                }
            }


        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTaskTheme {
        Greeting("Android")
    }
}