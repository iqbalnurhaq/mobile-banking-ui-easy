package com.nurhaq.mobilebankingui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BadgeBox
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nurhaq.mobilebankingui.ui.theme.BadgeColor
import com.nurhaq.mobilebankingui.ui.theme.BankColor
import com.nurhaq.mobilebankingui.ui.theme.NotifyColor


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MobileBankingUI() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BankColor)
    ) {
        Spacer(modifier = Modifier.height(25.dp))
        Column(
            modifier = Modifier
                .weight(0.28f)
                .fillMaxSize()
                .padding(
                    start = 20.dp,
                    end = 20.dp
                )
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "$4.258.50",
                    color = Color.White,
                    fontFamily = FontFamily(Font(R.font.poppins_bold)),
                    modifier = Modifier.weight(1f),
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )

                Column(
                    modifier = Modifier
                        .weight(0.8f)
                        .fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier
                            .align(Alignment.End),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        BadgeBox(
                            backgroundColor = BadgeColor
                        ) {
                            Icon(
                                Icons.Default.Notifications,
                                contentDescription = "Notification",
                                tint = NotifyColor,
                                modifier = Modifier
                                    .rotate(10f)
                                    .size(25.dp),
                            )
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Image(
                            painter = painterResource(id = R.drawable.makeiteasy),
                            contentDescription = "Profile Icon",
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .border(1.dp, Color.White, RoundedCornerShape(10.dp))
                                .size(40.dp)
                                .padding(3.dp)
                                .clip(RoundedCornerShape(7.dp))
                        )
                    }
                }
            }
            
            Text(
                text = "Available Balance",
                color = Color.White.copy(alpha = 0.5f),
                fontFamily = FontFamily(Font(R.font.poppins_light)),
                fontSize = 14.sp
            )


        }


    }
}