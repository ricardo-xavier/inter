package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1326")
public class Somador1326 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
