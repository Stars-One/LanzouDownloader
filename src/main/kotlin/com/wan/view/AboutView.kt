package com.wan.view

import javafx.geometry.Pos
import javafx.scene.text.FontWeight
import tornadofx.*
import java.awt.Desktop
import java.net.URI

class AboutView : View(" by stars-one") {

    override val root = vbox {

        vbox {
            paddingTop = 10.0
            spacing = 10.0
            setPrefSize(800.0, 300.0)
            text("蓝奏云批量下载 v1.1") {
                alignment = Pos.TOP_CENTER
                style {
                    fontWeight = FontWeight.BOLD
                    //字体大小，第二个参数是单位，一个枚举类型
                    fontSize = Dimension(18.0, Dimension.LinearUnits.px)
                }
            }
            text("使用HtmlUnit和okhttp打造的蓝奏云批量下载工具") {
                alignment = Pos.TOP_CENTER
            }
            form {
                hbox(20) {
                    fieldset {
                        alignment = Pos.CENTER
                        field("软件作者：") {
                            text("stars-one")
                        }
                        field("项目地址：") {
                            hyperlink("https://github.com/Stars-One/LanzouDownloader") {
                                setOnMouseClicked {
                                    Desktop.getDesktop().browse(URI(this.text.toString()))
                                }
                            }
                        }

                        field("博客地址：") {
                            hyperlink("www.cnblogs.com/stars-one") {
                                tooltip(this.text.toString())
                                maxWidth = 300.0
                                setOnMouseClicked {
                                    Desktop.getDesktop().browse(URI(this.text.toString()))
                                }
                            }
                        }
                        field("联系QQ：") {
                            text("1053894518")
                        }
                        field("软件交流群：") {
                            text("1046548165")
                        }
                    }
                    fieldset {
                        vbox(20) {
                            text("对你有帮助的话，不妨打赏一波") {
                                alignment = Pos.TOP_CENTER
                                style {
                                    fontWeight = FontWeight.BOLD
                                    //字体大小，第二个参数是单位，一个枚举类型
                                    fontSize = Dimension(18.0, Dimension.LinearUnits.px)
                                }
                            }
                            hbox(20) {
                                vbox(15) {
                                    text("微信") {
                                        alignment = Pos.TOP_CENTER
                                    }
                                    imageview(url = "img/weixin.jpg") {
                                        alignment = Pos.TOP_CENTER
                                        fitHeight = 160.0
                                        fitWidth = 160.0
                                        isPreserveRatio = true
                                    }
                                }
                                vbox(15) {
                                    text("支付宝") {
                                        alignment = Pos.TOP_CENTER
                                    }
                                    imageview(url = "img/zhifubao.jpg") {
                                        alignment = Pos.TOP_CENTER
                                        fitHeight = 160.0
                                        fitWidth = 160.0
                                        isPreserveRatio = true
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