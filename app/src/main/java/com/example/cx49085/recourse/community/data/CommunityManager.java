package com.example.cx49085.recourse.community.data;

import com.example.cx49085.recourse.R;
import com.example.cx49085.recourse.community.data.entity.NoteData;
import com.example.cx49085.recourse.community.data.entity.QuestionData;
import com.example.cx49085.recourse.community.data.entity.VRAreaData;

import java.util.ArrayList;
import java.util.List;



/**
 * Created by 10919 on 2018/4/6/006.
 */

public class CommunityManager {

    private static int[] VRAreaImgs = {
            R.drawable.vr_img1,
            R.drawable.vr_img2,
            R.drawable.vr_img3,
            R.drawable.vr_img4,
            R.drawable.vr_img5,
            R.drawable.vr_img6
    };
    private static int[] VRAreaBgColor = {
            R.color.light_blue,
            R.color.light_red,
            R.color.light_green,
            R.color.light_purple,
            R.color.light_yellow,
            R.color.light_red_purple
    };
    private static String[] VRAreaNames = {
            "金融交流专区",
            "会计交流专区",
            "经济交流专区",
            "外贸交流专区",
            "期货交流专区",
            "证券交流专区"
    };

    private static String[] VRAreaNums = {
            "21人参与",
            "34人参与",
            "12人参与",
            "31人参与",
            "28人参与",
            "41人参与",
    };

    private static String[] questionTitles = {
            "公司上市需要些什么条件和手续?流程是怎样的?？",
            "当今金融学前沿和热点问题有哪些？",
            "间接融资的比重过大怎么办？",
            "如何缓解企业的负债率过高？",
            "金融业务分业经营分业监管不利于企业全面发展？",
            "资本市场体系很不完善有什么具体体现？",
            "要素市场体系不完善如何破局？",
            "各种专项金融不发达,导致金融服务粗糙简单不能满足需要？"
    };

    private static String[] questionDetails = {
            "持有股票面值达人民币一千元以上的股东人数不少于一千人,向社会公开发行的股份达公司股份总数的百分之二十五以上；公司股本超过人民币四亿元的,其向社会公开发行的比例为百分之十五以上；",
            "有效市场假说提出任何投资人不可能始终如一地预测市场的方向。市场里投资者早就提出股市是随机和不可预测的,但获奖者之一,尤金·法玛,是第一个正式和实证检验的想法的经济学家。在20世纪60年代,法玛反驳了以查尔斯·道为首的技术分析派用过去的价格预判未来价格的理论。法玛的数据证实了新的信息马上就能反映在股价里,剩下的市场波动则是随机运动",
            "间接融资的局限性,主要是由于资金供给者与需求者之间加入了金融机构为中介,隔断了资金供求双方的直接联系,在一定程度上减少了投资者对投资对象经营状况的关注和筹资者在资金使用方面的压力和约束。",
            "在计划经济时期,国家的信贷政策主要集中在国家银行,企业发展所需资金的筹集渠道较为单一,城乡居民的闲散资金大部分是存入银行中,向企业投资的资金非常少,甚至是没有。同时,国家财政也无力向企业发展拨款,银行以借款的形式给企业提供发展资金。企业背着计划经济时代银行借款的包袱跨入到当今的市场经济中,市场经济所带来的竞争更为激烈,生存发展更为艰难",
            "分业监管体制的概念： 实行分业监管,对不同金融机构或金融业务分别成立专门监管机构进行监管。分业的监管机构除中央银行外,还有专门的证券监管机构、保险监管机构、银行监管机构。我国属于分业监管体制。",
            "我国资本市场投资主体结构不合理,投资者现在还是以个人投资者为主,机构投资者数量相对来说较少,两者比重相差较大。个人投资者的投资行为主要是以投机为主,而机构投资者则更注重对上市公司基本面分析,似的资本市场具有极大的不稳定性,阻碍了这种稳定资本市场功能的发挥。",
            "建立现代化经济体系,夯实迈向社会主义现代化强国的经济基础,必须加快完善社会主义市场经济体制。一是完善产权制度,实现产权有效激励；二是深化国有企业改革,推动国有资本做强做优做大；三是加快完善现代市场体系,激发各类市场主体活力；四是创新和完善宏观调控,促进经济平稳健康运行；五是加快建立现代财政制度,发挥好中央和地方两个积极性；",
            "金融市场还不够成熟,深度和广度不够。真正成熟的金融市场的标准是：好企业可以随时通过丰富的融资产品与渠道进行融资；长期投资者能够得到合适稳定的回报；市场价格基本合理；市场参与者遵守规则。但目前中国金融市场远远没有达到这些标准。决定人民币国际化关键的人民币“投资池”尚未形成；国内一级和二级市场、场内和场外市场、货币市场和资本市场等都存在不同程度的分割现象"
    };
    private static int[] questionAnswerNum = {
            13,
            21,
            6,
            7,
            88,
            123,
            11,
            3
    };

    private static String[] questionState = {
            "已解决",
            "待解决",
            "已解决",
            "待解决",
            "已解决",
            "已解决",
            "已解决",
            "待解决",
    };

    private static String[] noteTitles = {
            "并购对目标上市公司融资约束的缓解效应",
            "产业、结构风险特性与最优金融结构",
            "风险资本、制度效率与企业投资偏好",
            "互联网金融风险规制路径",
            "金融发展影响绿色全要素生产率的理论和实证研究",
            "金融发展与城市化进程",
            "金融化对实体企业未来主业发展的影响",
            "经济政策不确定性影响企业投资的渠道分析"
    };

    private static String[] noteInfo = {
            "融资约束限制了企业的投资机会,因而是中国上市公司发展过程中所面临的瓶颈之一。缓解融资约束的方法通常包括资本市场上的直接融资和金融机构的间接融资,然而,因为受制于资本市场的供求关系和银行监管制度强化等因素的影响,使得这些融资渠道变得异常艰难,并且需要为此付出高昂的成本,此时,通过并购行为建立一个更宽广的融资平台便成为许多企业选择的可行方式。",
            "从理论上说,并购主要通过建立内部资本市场和扩展目标企业的融资渠道以增加流动性,最终达到缓解融资约束的目的。内部资本市场理论最早由 Williamson ( 1970) 提出,其主要观点是,在税收差异和外部交易费用的条件下,并购可使企业内部资源根据投资项目边际利润的高低进行重新配置,从而缓解融资约束。",
            "在并购方和目标企业的现金流分布不均衡,目标企业又存在投资机会时,并购方通过建立内部资本市场,减少并购方闲置或收益较低的投资项目,从而更有效地利用并购双方的资金。Stulz ( 1990) 从市场价值角度讨论内部资本市场问题,认为外部资本市场上企业价值可能被低估,由此导致投资不足,而内部资本市场通过资金的有效配置,不仅能解决融资约束问题,也使企业价值得到提升。",
            "沿着构建内部资本市场这一基本思路,许多学者从扩展融资渠道和促进投资机会与融资能力相结合等角度进一步讨论并购与缓解融资约束之间的关系。Stein ( 1997)\t认为,从大企业集团的角度看,并购可提高获得外部资本的能力,从而能够更直接地从资本市场获取融资,而且还可产生内部现金流。",
            "Francis et al． ( 2008) 通过 20 世纪 90 年代至 21 世纪初美国跨国并购的实证分析发现,并购的积极效应主要与规模效应密切相关。来自细分市场的目标企业通常都经历过融资约束,而规模较大的并购方通过集团内部可提供成本较低的资金支持,以减轻目标企业的压力。",
            "国内在这一领域的研究成果相对较少,主要集中于两个方面。一方面是检验内部资本市场对融资约束的缓解效应。曾亚敏和张俊生 ( 2005) 以 1998－2000 年进行股权收购的上市公司为样本,对收购动因的两种假说———自由现金流假说和内部资本市场假说进行检验,结果发现,上市公司收购前后的会计业绩和市场业绩变动都与收购前的自由现金流显著负相关,但与融资约束程度基本无关,从而否定了内部资本市场假说。",
            "集团公司在解决融资约束问题时具有更多的优势,例如,它们的规模效应有利于强化与债权人在谈判过程中的地位,通过集团内部的资产抵押向金融机构融资,然后把资金投向需要支持的分支机构。",
            "概括地说,现有的国外研究集中于讨论在内部资本市场框架下并购对融资约束的影响,然而这些研究成果没有考虑到中国上市公司所面临的市场环境,因而难以反映企业融资约束的特征和解决路径。"

    };

    private static int[] noteBrowseNum = {
            18,
            143,
            13,
            98,
            33,
            11,
            66,
            71,
    };

    private static int[] noteGoodNum = {
            11,
            5,
            4,
            2,
            12,
            3,
            2,
            12,

    };


    public static List<VRAreaData> getVRAreaDatas() {
        List<VRAreaData> l = new ArrayList<VRAreaData>();
        for (int i = 0; i < VRAreaImgs.length; i++) {
            l.add(new VRAreaData(VRAreaImgs[i], VRAreaNames[i], VRAreaNums[i],VRAreaBgColor[i]));
        }
        return l;
    }
    private static String usernames[] = {"熊猫","大象与蚂蚁","何必远方","不见海洋","围城","温柔月光","不忘记","面目",
            "梨花","不归郞","一壶浊酒","佳人","江湖","醉里看花","雾里赏花","梦理","离人愁"};
    private static String times[] = {"2018-3-5","2018-1-8","2017-11-18","2017-10-30","2017-10-27","2017-9-24","2017-5-14","2017-4-6","2017-1-8"};
    private static int imgs[] = {R.drawable.question1,R.drawable.question2,R.drawable.question3,R.drawable.question4,R.drawable.question5,R.drawable.question6,R.drawable.question7,R.drawable.ic_mine_head,R.drawable.question1,};
    public static List<QuestionData> getQuestionDatas() {
        List<QuestionData> l = new ArrayList<QuestionData>();
        for (int i = 0; i < questionTitles.length; i++) {
            l.add(new QuestionData(usernames[i],questionTitles[i], questionAnswerNum[i], questionState[i],questionDetails[i],times[i],imgs[i]));
        }
        return l;
    }

    public static List<NoteData> getNoteDatas() {
        List<NoteData> l = new ArrayList<NoteData>();
        for (int i = 0; i < noteTitles.length; i++) {
            //int img, String username, String time, String title, String info, int browseNum, int goodNum
            l.add(new NoteData(imgs[i],usernames[i+8],times[i],noteTitles[i], noteInfo[i], noteBrowseNum[i], noteGoodNum[i]));
        }
        return l;
    }
}
