package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1427")
public class Somador1427 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
