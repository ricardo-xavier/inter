package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1794")
public class Somador1794 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
