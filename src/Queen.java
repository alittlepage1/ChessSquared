
import java.awt.Color;
import javax.swing.ImageIcon;

public class Queen extends Piece
{    
    public Queen(Color color, ChessBlock startingPosition)
    {
        super(color, startingPosition);
        pieceName = "queen";
        value = 1000;
    }

    @Override
    public ImageIcon getPieceIcon() 
    {
        if (color == Color.WHITE)
        {
            return new ImageIcon(getClass().getResource("resources/White_Queen.png"));
        }
        else
        {
            return new ImageIcon(getClass().getResource("resources/Black_Queen.png"));
        }
    }
}
