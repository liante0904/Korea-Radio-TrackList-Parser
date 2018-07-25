# Korea-Radio-TrackList-Parser
> 한국 라디오 선곡표 파싱 모듈입니다.

### Environment
- Java 1.8
- jsoup 1.10.2

# Test-Page

### KBS
- http://nbbs.kbs.co.kr/section/board/bbs_view.html?bbs_cd=2r_7080_bbs07&seq=599716&goto_page=1

### SBS
- http://radio.sbs.co.kr/music/wizard_broadcast_renew.jsp?vod_id=V0000330602&year=2016&month=07&day=25&position_code=romanticage

### MBC
- http://mini.imbc.com/manager/SelectView.asp?PROG_CD=FM4U000001271&SeqNo=1061&PG=1

# Hint

### KBS

- 가장 난해한 구조를 가지고 있으며 RSS를 지원하고 있으나 전혀 규격에 맞지 않음 ~~RSS는 없느니만 못합니다~~

### SBS

- 웹 표준에 맞는 형식을 가지고 있어 파싱하기 편리. 음원은 멜론의 데이터를 사용했던 것으로 기억합니다.

### MBC

- 본인의 최종 목표였던 선곡표를 이용한 인기차트를 방송사에서 구현하여 서비스 중..
- 홍보 전혀 안되있고 찾는 사람도 없어서 ~~존재감이....~~
- 선곡표 자체는 db에 기반한건 아닌듯.. 라디오 프로마다 음원이 표기법이 다릅니다(심지어 같은 곡인데도) 
- KBS보다 파싱은 쉬운데. 파싱 후 데이터 후 처리가 더 빡셀것으로 기대됩니다 (?)

## etc
언젠가는 라디오 선곡표로 차트를 예정이지만.. 그게 언제 될지는... ~~모르겠네요.~~

