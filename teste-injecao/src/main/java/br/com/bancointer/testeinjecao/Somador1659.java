package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1659")
public class Somador1659 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
