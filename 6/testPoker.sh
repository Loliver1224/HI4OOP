while true;do
    out=$(echo 9 | java PokerGame)
    echo $out | if grep one; then $out > out.txt; fi; sleep 1
done
