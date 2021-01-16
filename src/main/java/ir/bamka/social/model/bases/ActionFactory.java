package ir.bamka.social.model.bases;

import ir.bamka.social.model.to.*;

public class ActionFactory {
    public static Action getInteraction(int typId) {
        Action interactionTO = null;
        switch (typId) {
            case 1:
                interactionTO = new OffLike();
                break;
            case 2:
                interactionTO = new OffComment();
                break;
            case 3:
                interactionTO = new OffReport();
                break;
            case 4:
                interactionTO = new OffSeen();
                break;
            case 5:
                interactionTO = new VocherLike();
                break;
            case 6:
                interactionTO = new VocherComment();
                break;
            case 7:
                interactionTO = new VocherfReport();
                break;
            case 8:
                interactionTO = new VocherSeen();
            default:
                System.out.println("Not Range");
                break;
        }
        return interactionTO;
    }
}
