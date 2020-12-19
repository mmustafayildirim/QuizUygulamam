package com.quizApp.myapplication

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()


        val que1 = Question(
            1, "Atatürk kaç yılında doğdu?",
            R.drawable.ataturk,
            "1874", "1881",
            "1897", "1997", 2
        )

        questionsList.add(que1)

        val que2 = Question(
            2, "Türkiye'de kaç il vardır?",
            R.drawable.turkiye,
            "62", "61",
            "81", "71", 3
        )

        questionsList.add(que2)

        val que3 = Question(
            3, "Türkiye'de kaç tane büyüksehir vardır?",
            R.drawable.buyuksehir,
            "30", "15",
            "80", "21", 1
        )

        questionsList.add(que3)
        val que4 = Question(
            4, "Son Osmanlı Padişahı Kimdir?",
            R.drawable.vahdettin,
            "Kuyucu Murat", "2.Mustafa",
            "Selaaddin Eyyübi", "Sultan Vahdettin", 4
        )

        questionsList.add(que4)
        val que5 = Question(
            5, "Kangal köpeği hangi ilimize aittir?",
            R.drawable.kangal,
            "Kahramanmaraş", "Sivas",
            "Çorum", "Kangal", 2
        )

        questionsList.add(que5)

        val que6 = Question(
            6, "Ülkemizde en çok fındık üretimi hangi ilimizdedir?",
            R.drawable.findik,
            "Giresun", "Sivas",
            "Ordu", "İzmir", 3
        )

        questionsList.add(que6)
        val que7 = Question(
            7, "Türkiye'nin en büyük yüz ölçümüne sahip ikinci ili?",
            R.drawable.yuzolcum,
            "Konya", "Samsun",
            "Antalya", "Sivas", 4
        )

        questionsList.add(que7)

        val que8 = Question(
            8, "İstanbul'da en çok gürbetçisi bulunan şehir?",
            R.drawable.kalabalik,
            "Sivas", "Kayseri",
            "Tokat", "Suriye", 1
        )

        questionsList.add(que8)
        val que9 = Question(
            9, "Türkiye'nin ilk yerli otomobili hangisidir?",
            R.drawable.otomobil,
            "Anadolu", "Devrim",
            "Hacı Murat", "TOGG", 2
        )

        questionsList.add(que9)
        val que10 = Question(
            10, "Madımak hangi yöremize ait bir bitkidir?",
            R.drawable.madimak,
            "Erzincan", "Nevşehir",
            "Sivas", "Kars", 3
        )

        questionsList.add(que10)

        return questionsList
    }
}