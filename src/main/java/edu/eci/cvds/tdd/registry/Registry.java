package edu.eci.cvds.tdd.registry;

public class Registry {
    public RegisterResult registerVoter(Person p) {
        RegisterResult result = null;
        if (p.getAge() <= 0 || p.getAge() > 110){
            result = RegisterResult.INVALID_AGE;
        } else if (p.getAge() < 18 && p.getAge() > 0){
            result =  RegisterResult.UNDERAGE;
        } else if (p.getAge() >= 18 && p.getAge() < 110) {
            result =  RegisterResult.VALID;
        }
        return result;
    }

    public Ids registerVoterId(Person p) {
        Ids result = null;
        int l = Integer.toString(p.getId()).length();
        if (l > 6 && l < 10){
            result = Ids.VALID_ID;
        } else {
            result =  Ids.INVALID_ID;
        }
        return result;
    }
}
