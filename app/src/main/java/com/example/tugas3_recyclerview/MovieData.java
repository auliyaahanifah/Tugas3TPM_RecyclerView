package com.example.tugas3_recyclerview;

import java.util.ArrayList;

public class MovieData {

    private static String[] movieTitle = {
            "STAND BY ME DORAEMON 2",
            "Godzilla vs. Kong",
            "Greenland",
            "Mortal Kombat (IMAX 2D)",
            "Ip Man: Kungfu Master",
            "Jangan Sendirian",
            "Raya and the Last Dragon",
            "Shadow in the Cloud",
            "Villa Angker Lembang",
            "Wonder Woman 1984"
    };

    private static String[] movieDetail = {
            "Suatu hari Nobita (suara diisi oleh Ohara Megumi) menemukan boneka beruang yang ditambal jahit tangan oleh nenek tercinta (suara diisi oleh Miyamoto Nobuko). Hal tersebut memicu kenangan mengharukan untuknya dan menanyakan kepada Doraemon (suara diisi oleh Mizuta Wasabi) apakah mereka dapat menggunakan mesin waktu untuk mengunjungi Nenek di masa lampau.",
            "Sebuah pertarungan epic dalam sinematik Monsterverse antara Godzilla dan Kong.\n" +
                    "\n" +
                    "Pertarungan Godzilla vs. Kong membuat umat manusia harus bertahan dengan berbagai cara. Salah satunya adalah memusnahkan kedua raksasa tersebut.\n" +
                    "\n" +
                    "Siapa yang akan menang?",
            "Sebuah keluarga berjuang untuk bertahan hidup saat komet mulai menghujam ke bumi. John Garrity (Gerard Butler) beserta istrinya Allison (Morena Baccarin), dan putranya Nathan melakukan perjalanan yang berbahaya menuju satu-satunya harapan mereka untuk tempat perlindungan.",
            "Kehidupan Cole Young (Lewis Tan) menjadi berubah saat Kaisar Shang Tsung (Chin Han) dari Outworld datang dan memburu rahasia dan warisan keluarganya. Shang Tsung mengirim petarung terbaiknya, Sub-Zero (Joe Taslim), untuk memburu Cole.\n" +
                    "\n" +
                    "Cole akhirnya memutuskan untuk mencari cara untuk melawan kekuatan Outworld. Hingga akhirnya ia bertemu dengan Liu Kang (Ludi Lin), Kano (Josh Lawson) dan Kung Lao (Max Huang).",
            "Berkisah tentang Ip, seorang kapten polisi yang menjadi sasaran mafia di daerahnya. Tidak hanya itu, ia juga mendapatkan masalah dengan kedatangan tentara Jepang yang hendak menguasai daerahnya.",
            "4 (empat) tokoh secara bergantian mengalami peristiwa menyeramkan ketika mereka sendiri. Teror mahluk-mahluk halus yang menebar ketakutan, kepanikan, dan histeria ini datang begitu saja tanpa mereka duga. Sebenarnya apa yang terjadi hingga para setan begitu mengincar mereka. Hubungan apa yang mengikat satu sama lain dengan para mahluk tersebut. Tentu segala misteri dalam film horor modern berkonsep \"mini kata\" ini, layak dinantikan oleh para penonton bioskop.",
            "Walt Disney Animation Studios mempersembahkan film terbaru Raya and the Last Dragon, sebuah petualangan yang berlatar di negeri fantasi Kumandra, di mana manusia dan naga hidup berdampingan dalam harmoni. Namun, ketika kejahatan mengancam rakyat Kumandra, para naga mengorbankan diri mereka untuk menyelamatkan umat manusia.\n" +
                    "\n" +
                    "Kini, 500 tahun kemudian, kejahatan yang sama telah kembali dan nasib mereka bergantung pada seseorang pendekar bernama Raya, untuk mencari sang naga terakhir yang dapat mempersatukan kembali tanah dan masyarakat Kumandra yang terpisah.\n" +
                    "\n" +
                    "Dalam perjalanannya, Raya menyadari bahwa, untuk menyelamatkan dunia, hal yang dibutuhkan bukan hanya seekor naga, namun juga rasa saling percaya dan kerja sama.",
            "Seorang pilot wanita yang menjaga dokumen rahasia dengan setting waktu masa Perang Dunia II. Ia ditugaskan menjaga paket misterius yang sangat rahasia.\n" +
                    "\n" +
                    "Sang pilot wanita itu bernama Maude Garrett (Chloë Grace Moretz). Ia bergabung bersama kru yang semuanya laki-laki.\n" +
                    "\n" +
                    "Awalnya para kru merasa kaget dan ragu dengan kedatangan wanita dalam penerbangan militer. Namun Kapten Maude Garrett berhasil meyakinkan mereka dengan skil dan kecerdasannya.",
            "Kemal adalah seorang pria muda yang sukses, ia adalah seorang pemilik perusahaan pial saham yang besar dan memiliki keluarga kecil yang bahagia. Dia dan istrinya, citra berencana membangun sebuah bisnis resort di atas lahan kosong di kota lembang, Kemal pergi perkampungan di sekitar lahannya, dan tidak sengaja bertemu sujiwo, sang penjaga villa.\n" +
                    "\n" +
                    "Sujiwo menawarinya sebuah resort tua dengan beberapa villa dan lahan yang luas di dalamnya yang sudah ditinggalkan pemiliknya ke luar negeri. Pria itu memberi Kemal harga yang bagus untuk villa – villa tersebut dibanding jika Kemal haris membangun resort baru di lahan kosong yangs udah pasti membutuhkan biaya yang lebih banyak.\n" +
                    "\n" +
                    "Kemal akhirnya memutuskan untuk membeli villa – villa tersebut dan berniat merenovasi. Kemal, Citra beserta Satria (anaknya), dan Nadine (adik iparnya), mereka pergi ke resort tersebut untuk liburan akhir pekan. Tidak berselang lama, Kemal dan keluarga kecilnya menyadari bahwa villa- villa itu berhantu. Mereka dihantui oleh sosok – sosok menyeramkan yang menggiring mereka ke sisi tergelap resort tersebut.",
            "Berlatar setting tahun 1980-an, petualangan Wonder Woman selanjutnya adalah menghadapi dua musuh baru: Max Lord dan The Cheetah."
    };

    private static String[] movieDirector  = {
            "Ryuichi Yagi, Takashi Yamazaki",
            "Adam Wingard",
            "Ric Roman Waugh",
            "Simon McQuoid",
            "Li Liming",
            "X.Jo",
            "Don Hall, Carlos Lopez Estrada",
            "Roseanne Liang",
            "Sameer Saikh",
            "Patty Jenkins"
    };

    private static String[] movieReleaseDate = {
            "31 March 2021",
            "2 April 2021",
            "26 March 2021",
            "5 March 2021",
            "26 February 2021",
            "2 April 2021",
            "19 March 2021",
            "5 March 2021",
            "25 November 2020",
            "10 October 2020"
    };

    private static String[] movieRunningTime = {
            "1h 53min",
            "1h 39min",
            "1h 32min",
            "1h 47min",
            "1h 41min",
            "1h 40min",
            "1h 52min",
            "1h 49min",
            "1h 35min",
            "1h 53min"
    };
    private static int[] moviePhoto  = {
            R.drawable.doraemon,
            R.drawable.godzilla,
            R.drawable.greenland,
            R.drawable.imax2d,
            R.drawable.ipman,
            R.drawable.jgns,
            R.drawable.raya,
            R.drawable.shadow,
            R.drawable.villa_angker,
            R.drawable.wonder_woman
    };

    static ArrayList<Movie> getListData() {
        ArrayList<Movie> list = new ArrayList<>();

        for (int position = 0; position < movieTitle.length; position++) {
            Movie movie = new Movie();
            movie.setPhoto(moviePhoto[position]);
            movie.setTitle(movieTitle[position]);
            movie.setDirector(movieDirector[position]);
            movie.setRelease(movieReleaseDate[position]);
            movie.setRuningt(movieRunningTime[position]);
            movie.setDesc(movieDetail[position]);
            list.add(movie);
        }
        return list;
    }
}
