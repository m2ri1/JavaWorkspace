public class VendingMachine {
    public String pushButton(int menuID){
        System.out.println(menuID + " 원을 전달받았습니다");

        if (menuID == 100)
        return "고구마 말랭이";
        else if (menuID == 200)
            return "만두 말랑이";
        else if (menuID == 300)
            return "고구마 말랑이";
        else if (menuID == 400)
            return "달걀 말랑이";
        else
            return "말랑카우";
    }
}
