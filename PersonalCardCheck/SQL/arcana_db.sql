CREATE DATABASE IF NOT EXISTS arcana_db
    CHARACTER SET utf8;

USE arcana_db;

CREATE TABLE IF NOT EXISTS arcana(
    arcana_no INTEGER NOT NULL,
    arcana_name VARCHAR(50) NOT NULL UNIQUE,
    nomal_mean VARCHAR(200) NOT NULL UNIQUE,
    reverse_mean VARCHAR(200) NOT NULL UNIQUE,
    persona VARCHAR(500) NOT NULL,
    PRIMARY KEY (arcana_no)
);

CREATE TABLE IF NOT EXISTS positions(
    position_no INTEGER NOT NULL,
    position_name VARCHAR(10) NOT NULL,
    PRIMARY KEY (position_no)
);

CREATE TABLE IF NOT EXISTS fotune_table(
    id INTEGER NOT NULL,
    arcana_no INTEGER NOT NULL,
    position_no INTEGER NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (arcana_no) REFERENCES arcana (arcana_no),
    FOREIGN KEY (position_no) REFERENCES positions (position_no)
);


INSERT INTO arcana VALUES(0,'愚者',
    '新しい始まり、冒険心、自由、無邪気さ、可能性',
    '停滞、無謀な行動、迷い、無責任、無気力',
    'このカードは、あなたの無限の可能性と、未知の世界への冒険心を表しています。あなたは純粋な心で、新しいことに挑戦することを恐れません。しかし、計画性不足や無謀さから、失敗してしまうこともあるでしょう。自分の可能性を信じて、一歩踏み出す勇気を持ちましょう。しかし、同時に慎重さも忘れずに。'
);

INSERT INTO arcana VALUES(1,'魔術師',
    '意志、行動力、創造性、潜在能力、可能性',
    '自信喪失、無気力、計画倒れ、才能の浪費、欺瞞',
    'このカードは、あなたの内に秘めた才能と、それを開花させるための行動力を表しています。あなたは自信と意欲を持って、目標に向かって進んでいける人です。しかし、計画性や集中力に欠ける場合、せっかくの才能も活かせずに失敗してしまうこともあります。自分の才能を信じて、積極的に行動しましょう。計画性と集中力を持ち、目標に向かって努力すれば、きっと成功を収めることができます。'
);


INSERT INTO arcana VALUES(2,'女教皇',
    '直感、秘密、受容、内省、神秘',
    '誤解、秘密の暴露、閉ざされた心、偏見、無知',
    'このカードは、あなたの鋭い直感力と、深い洞察力を表しています。あなたは表面的な情報に惑わされることなく、物事の本質を見抜くことができる人です。しかし、内に秘めた力を使いこなすことができずに、迷い込んでしまうこともあるでしょう。自分の直感を信じて、内なる声に耳を傾けましょう。静寂の中で自分と向き合い、深遠な知識を身につけることで、真の力を発揮することができます。'
);

INSERT INTO arcana VALUES(3,'女帝',
    '豊穣、安定、母性、愛情、繁栄',
    '不安定、浪費、無責任、家庭内トラブル、愛情不足',
    'このカードは、あなたの豊かな愛情と、包容力のある母性を表しています。あなたは周囲の人を温かく癒し、成長を促す存在です。しかし、愛情を注ぎすぎて、相手を依存させてしまうこともあるでしょう。自分の愛情を惜しみなく与えましょう。しかし、相手を尊重し、自立を促すことも忘れないでください。バランスを保つことで、真の繁栄と幸福を築くことができます。'
);

INSERT INTO arcana VALUES(4,'皇帝',
    '権力、秩序、統率力、責任感、成功',
    '権威主義、独裁、支配欲、無責任、失敗',
    'このカードは、あなたの強い意志と、リーダーシップを表しています。あなたは目標に向かって力強く進んでいくことができる人です。しかし、独裁的な態度を取ってしまうと、周囲の人から孤立してしまうこともあるでしょう。自分の意志を貫きながらも、周囲の人を尊重し、協力を取りましょう。責任感を持ってリーダーシップを発揮することで、大きな成功を収めることができます。'
);

INSERT INTO arcana VALUES(5,'法王',
    '信仰、知識、道徳、指導、伝統',
    '偽善、疑心暗鬼、迷信、偏見、教条主義',
    'このカードは、あなたが伝統や社会規範を重んじる人であることを表しています。あなたは知識や経験を積み、周囲の人を導く存在となるでしょう。しかし、形式や規則にこだわりすぎて、柔軟性に欠ける場合もあるでしょう。伝統や規範を大切にしつつも、新しい考えを取り入れる柔軟性も持ちましょう。多様な価値観を受け入れることで、より深い知識と寛容さを身につけることができます。'
);

INSERT INTO arcana VALUES(6,'恋愛',
    '愛情、選択、決断、パートナーシップ、調和',
    '不和、葛藤、三角関係、決断力不足、孤独',
    'ここのカードは、あなたの豊かな愛情と、人との深い繋がりを表しています。あなたはパートナーとの調和を大切にし、共に成長していくことを望む人です。しかし、優柔不断な態度で、大切な人を傷つけてしまうこともあるでしょう。自分の心と向き合い、真実の愛を見極めましょう。パートナーとオープンにコミュニケーションをとり、信頼関係を築くことで、真の幸福を手にすることができます。'
);

INSERT INTO arcana VALUES(7,'戦車',
    '勝利、突破、行動力、自信、挑戦',
    '停滞、挫折、自信喪失、無気力、逃避',
    'このカードは、強い意志と自信を持って目標へ向かって突き進むあなたを表しています。周囲の反対や困難にも臆することなく、自らの道を切り開いていくでしょう。しかし、猪突猛進になりすぎるあまり、周囲を巻き込んでトラブルに発展してしまう可能性もあります。冷静さを失わず、状況を判断しながら行動することが大切です。'
);

INSERT INTO arcana VALUES(8,'正義',
    '公正、公平、真実、法、秩序',
    '不公平、偏見、不正、嘘、混乱',
    'このカードは、あなたの強い意志と、目標に向かって突き進む行動力を表しています。あなたは困難な状況でも、あきらめずに前進し続けることができる人です。しかし、猪突猛進になりすぎて、周囲の人を巻き込んでしまうこともあるでしょう。自分の目標を明確にし、計画的に行動しましょう。周囲の人との協力関係を築き、力を合わせることで、より大きな成功を収めることができます。'
);

INSERT INTO arcana VALUES(9,'隠者',
    '内省、孤独、探求、慎重、忍耐',
    '孤立、逃避、迷い、自信喪失、焦燥',
    'このカードは、あなたの深い内面世界と、真理を探求する精神を表しています。あなたは一人でじっくりと考えることを好み、周囲の人とは距離を置いてしまうこともあるでしょう。しかし、孤独を恐れることなく、自分自身と向き合うことで、真の成長を遂げることができます。静寂の中で自分と向き合い、内なる声に耳を傾けましょう。深い洞察力と思慮深さを活かして、人生の真理を探求することで、より大きな智慧を得ることができます。'
);

INSERT INTO arcana VALUES(10,'運命',
    '変化、転機、運命、サイクル、チャンス',
    '停滞、抵抗、不運、予期せぬ障害、チャンスの逃し',
    'このカードは、あなたの人生に大きな影響を与える出来事や、乗り越えるべき課題を表しています。あなたは運命を受け入れ、前向きに進んでいくことができる人です。しかし、時には試練に苦しみ、立ち止まってしまうこともあるでしょう。運命を受け入れ、前向きに進んでいきましょう。試練はあなたを成長させるためのものです。困難を乗り越えることで、より強い意志と深い智慧を得ることができます。'
);

INSERT INTO arcana VALUES(11,'力',
    '力、自信、勇気、活力、克服',
    '無力感、自信喪失、弱気、消極的な態度、抵抗',
    'このカードは、あなたの内に秘めた強さと、困難を乗り越える勇気を表しています。あなたは困難な状況でも、あきらめずに立ち向かうことができる人です。しかし、自分の力を過信し、周囲の人を傷つけてしまうこともあるでしょう。自分の力を正しく使いましょう。自信を持って行動し、困難に立ち向かうことで、より大きな成功を収めることができます。周囲の人を尊重し、協力関係を築くことも大切です。'
);

INSERT INTO arcana VALUES(12,'つるされた男',
    '犠牲、試練、忍耐、受容、降伏',
    '抵抗、執着、逃避、自己犠牲、被害者意識',
    'このカードは、あなたの人生における試練や、乗り越えるべき課題を表しています。あなたは困難な状況を受け入れ、忍耐強く立ち向かうことができる人です。しかし、時には苦しみから逃れようと、楽な道を選んでしまうこともあるでしょう。困難な状況に置かれている場合は、その意味を理解し、前向きに受け入れましょう。試練を乗り越えることで、より深い成長を遂げることができます。'
);

INSERT INTO arcana VALUES(13,'死神',
    '変化、再生、終わり、新たな始まり、変容',
    '停滞、固執、死への恐怖、無気力、諦め',
    'このカードは、あなたの人生における大きな変化や、新しい始まりの象徴です。あなたは変化を受け入れ、積極的に新しい道を歩み始めることができる人です。しかし、時には過去の栄光にしがみつき、変化を恐れてしまうこともあるでしょう。変化を恐れずに、新しい一歩を踏み出しましょう。過去にとらわれず、未来に向かって進んでいくことで、より素晴らしい人生を創造することができます。'
);

INSERT INTO arcana VALUES(14,'節制',
    'バランス、調和、節度、忍耐、自制心',
    '不調和、偏見、過剰、無節制、衝動',
    'このカードは、あなたの人生におけるバランスと調和を表しています。あなたは様々な要素をバランスよく調整し、物事を円滑に進めることができる人です。しかし、時には極端な考えに走り、周囲の人との調和を乱してしまうこともあるでしょう。常にバランスを意識し、中庸な道を歩みましょう。様々な意見を尊重し、柔軟な対応をすることで、より良い結果を得ることができます。'
);

INSERT INTO arcana VALUES(15,'悪魔',
    '誘惑、欲望、物質主義、依存、束縛',
    '誘惑からの解放、自立、精神的な成長、克服',
    'このカードは、あなたの人生における誘惑や、克服すべき課題を表しています。あなたは強い意志と自制心を持って、誘惑に打ち勝ち、正しい道を選ぶことができる人です。しかし、時には欲望に負けて、後悔してしまうこともあるでしょう。誘惑に惑わされず、自分の心と向き合いましょう。真の価値観を見極め、正しい道を歩むことで、より充実した人生を送ることができます。'
);

INSERT INTO arcana VALUES(16,'塔',
    '崩壊、破壊、変化、覚醒、解放',
    '停滞、固執、恐怖、混乱、先延ばし',
    'このカードは、あなたの人生における突然の出来事や、大きな変化を表しています。あなたは変化を受け入れ、柔軟に対応することで、新たな道を切り開くことができます。しかし、時には変化を恐れ、立ち止まってしまうこともあるでしょう。変化を恐れずに、新しい一歩を踏み出しましょう。古い価値観に固執せず、柔軟に対応することで、より素晴らしい人生を創造することができます。'
);

INSERT INTO arcana VALUES(17,'星',
    '希望、夢、目標、未来への展望、インスピレーション',
    '希望喪失、失望、迷い、不安、停滞',
    'このカードは、あなたの人生における希望と、明るい未来への展望を表しています。あなたは夢や目標に向かって、積極的に努力を続けることができる人です。しかし、時には挫折や失望を経験し、希望を失ってしまうこともあるでしょう。希望を持ち続け、前向きに進んでいきましょう。自分の才能を信じて努力することで、夢や目標を達成することができます。周囲の人との協力も大切です。'
);

INSERT INTO arcana VALUES(18,'月',
    '幻想、夢、潜在意識、不安、迷い',
    '現実逃避、幻想の崩壊、不安解消、明確化',
    'このカードは、あなたの人生における不安や迷い、そして内なる声を表しています。あなたは感受性が豊かで、周囲の雰囲気に敏感に反応する人です。しかし、その反面、幻想や欺瞞に惑わされやすく、真実を見失ってしまうこともあるでしょう。自分の内なる声に耳を傾け、真実を見極めましょう。直感力と理性、そして行動力を活かして、不安や迷いを乗り越えることができます。'
);

INSERT INTO arcana VALUES(19,'太陽',
    '幸福、成功、達成、充実、楽観',
    '不幸、失敗、挫折、失望、悲観',
    'このカードは、あなたの人生における幸福と、成功を表しています。あなたは周囲の人を明るく照らすような、存在感のある人です。しかし、時には傲慢になり、周囲の人を傷つけてしまうこともあるでしょう。自分の力を正しく使いましょう。自信を持って行動し、周囲の人を照らすことで、より大きな幸福を手に入れることができます。'
);

INSERT INTO arcana VALUES(20,'審判',
    '復活、再生、審判、決断、新たな始まり',
    '停滞、迷い、自己否定、決断力不足、後悔',
    'このカードは、あなたの人生における新たな始まりと、過去の清算を表しています。あなたは過去の経験を活かし、より良い未来に向かって進んでいくことができる人です。しかし、時には過去のトラウマに囚われ、前に進むことができなくなることもあるでしょう。過去の経験を学び、未来に向かって進んでいきましょう。過去のトラウマに囚われず、自分自身を信じて行動することで、より充実した人生を送ることができます。'
);

INSERT INTO arcana VALUES(21,'世界',
    '完成、達成、成功、満足、円満',
    '不完全、失敗、挫折、不満、停滞',
    'このカードは、あなたの人生における完成と、新たな旅立ちを表しています。あなたは努力を積み重ね、目標を達成することができる人です。しかし、時には満足してしまい、成長を止めてしまうこともあるでしょう。常に前進し続けましょう。目標を達成しても、そこで満足せず、新たな目標に向かって進んでいくことで、より素晴らしい人生を送ることができます。'
);
-- 参照　https://ja.wikipedia.org/wiki/%E3%82%BF%E3%83%AD%E3%83%83%E3%83%88%E5%8D%A0%E3%81%84

INSERT INTO positions VALUES(
    0,'正位置'
);
INSERT INTO positions VALUES(
    1,'逆位置'
);

INSERT INTO fotune_table VALUES(1,0,0);
INSERT INTO fotune_table VALUES(2,0,1);
INSERT INTO fotune_table VALUES(3,1,0);
INSERT INTO fotune_table VALUES(4,1,1);
INSERT INTO fotune_table VALUES(5,2,0);
INSERT INTO fotune_table VALUES(6,2,1);
INSERT INTO fotune_table VALUES(7,3,0);
INSERT INTO fotune_table VALUES(8,3,1);
INSERT INTO fotune_table VALUES(9,4,0);
INSERT INTO fotune_table VALUES(10,4,1);
INSERT INTO fotune_table VALUES(11,5,0);
INSERT INTO fotune_table VALUES(12,5,1);
INSERT INTO fotune_table VALUES(13,6,0);
INSERT INTO fotune_table VALUES(14,6,1);
INSERT INTO fotune_table VALUES(15,8,0);
INSERT INTO fotune_table VALUES(16,8,1);
INSERT INTO fotune_table VALUES(17,9,0);
INSERT INTO fotune_table VALUES(18,9,1);
INSERT INTO fotune_table VALUES(19,10,0);
INSERT INTO fotune_table VALUES(20,10,1);
INSERT INTO fotune_table VALUES(21,11,0);
INSERT INTO fotune_table VALUES(22,11,1);
INSERT INTO fotune_table VALUES(23,12,0);
INSERT INTO fotune_table VALUES(24,12,1);
INSERT INTO fotune_table VALUES(25,13,0);
INSERT INTO fotune_table VALUES(26,13,1);
INSERT INTO fotune_table VALUES(27,14,0);
INSERT INTO fotune_table VALUES(28,14,1);
INSERT INTO fotune_table VALUES(29,15,0);
INSERT INTO fotune_table VALUES(30,15,1);
INSERT INTO fotune_table VALUES(31,16,0);
INSERT INTO fotune_table VALUES(32,16,1);
INSERT INTO fotune_table VALUES(33,17,0);
INSERT INTO fotune_table VALUES(34,17,1);
INSERT INTO fotune_table VALUES(35,18,0);
INSERT INTO fotune_table VALUES(36,18,1);
INSERT INTO fotune_table VALUES(37,19,0);
INSERT INTO fotune_table VALUES(38,19,1);
INSERT INTO fotune_table VALUES(39,20,0);
INSERT INTO fotune_table VALUES(40,20,1);
INSERT INTO fotune_table VALUES(41,21,0);
INSERT INTO fotune_table VALUES(42,21,1);
