package ru.kpfu.itis.springControllers.utils;

import ru.kpfu.itis.springControllers.model.Source;

import java.util.ArrayList;
import java.util.List;

public class SourcesAdd {

    private List<Source> sources =new ArrayList<>();

    public List<Source> pullSources(){
        Source source = new Source("Теория дедукции", "«Теория дедукции» — некоммерческая образовательно-информационная организация, целью которой является развитие дедуктивных способностей и логики в общем, критического и аналитического мышления, острой наблюдательности и детективных навыков, обучение узнаванию чего-либо о человеке по его одежде, телефону, аксессуарам и общему виду, выведению железных умозаключений в конкретных ситуациях и обстановках.\n" +
                "\n" +
                "Исходя из этого мы собираем и структурируем информацию из сети в нашей группе, а если какая-то информация отсутствует, то мы её пишем или дорабатываем самостоятельно.\n", "https://vk.com/theory_of_deduction");

        Source source1 = new
                Source("TED Talks. Ideas worth spreading", " Find incredible, inspiring talks and a mind-opening experience here", "https://vk.com/talks_ted");

        Source source2 = new
                Source("Newочём", "Здесь вы найдёте переводы самых интересных статей из иностранных СМИ со всего мира.\n" +
                "\n" +
                "Все материалы берутся из первоисточника, переводятся и предстают перед вами. Мы только заголовок придумываем. Enjoy!", "https://vk.com/newochem");

        Source source3 = new Source(
                "Образовательный портал 4brain.ru", "На сайте и в сообществе размещаются материалы для обучения полезным интеллектуальным навыкам: скорочтению, риторике, устному счету, развитию памяти, креативности, лидерству, логике, актерскому мастерству, психологии человека, логическому мышлению, тайм-менеджменту, писательскому мастерству и многим другим. \n",
                "Образовательный портал 4brain.ru");

        Source source4 = new Source(
                "TrashSmash",
                "Обзоры и разгромы различного треша, мифов, предрассудков и заблуждений в той или иной мере распространенных в обществе. Художественный научпоп.",
                "https://www.youtube.com/user/TrashRecord");

        Source source5 = new Source(
                "SciOne",
                "Мы команда энтузиастов-волонтёров: молодые учёные, журналисты, инженеры, художники, специалисты и просто творческие люди. \n" +
                        "\n" +
                        "Мы считаем науку и просвещение величайшими достижениями человечества. Знания могут здесь и сейчас менять к лучшему и даже спасать жизни. \n" +
                        "\n" +
                        "Поэтому мы хотим сделать науку и любовь к знаниям популярными. Для этого мы делаем наш канал. ",
                "https://www.youtube.com/channel/UCSaVoRErW4kqKsDqExs2MXA"
        );

        Source source6 = new Source(
                "QWERTY",
                "QWERTY - популярный канал о науке и технологиях. Критическое мышление и здравый смысл!",
                "https://www.youtube.com/user/QWRTru"
        );

        sources.add(source);
        sources.add(source1);
        sources.add(source2);
        sources.add(source3);
        sources.add(source4);
        sources.add(source5);
        sources.add(source6);

        return sources;
    }
}