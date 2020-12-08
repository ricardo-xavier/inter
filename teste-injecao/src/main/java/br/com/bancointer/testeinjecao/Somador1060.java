package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1060")
public class Somador1060 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
